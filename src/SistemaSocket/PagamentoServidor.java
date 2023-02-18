package SistemaSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PagamentoServidor {

    public void iniciar() throws Exception {

        ServerSocket ss = new ServerSocket(1212);

        while (true) {
            Socket clienteSocket = null;

            try {
                System.out.println("Aguardando requisição do cliente...");
                clienteSocket = ss.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                PrintStream out = new PrintStream(clienteSocket.getOutputStream());

                String opcao = in.readLine();

                if (opcao.equals("Pagamento")) {
                    processandoPagamento(in, out);
                }else {
                    System.out.println("Pagamento não aceito!");
                }
            }
        finally {
                if (clienteSocket != null) {
                    clienteSocket.close();
                }
            }
        }
    }

    private void processandoPagamento(BufferedReader in, PrintStream out) {
        int qtdPagamento;

        try {
            qtdPagamento = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            out.println("Pagamento falhou" + e.getMessage());
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");

        for (int i = 0; i < qtdPagamento; i++) {

            try {
                String dados = in.readLine();
                String[] quadros = dados.split(";");
                String clienteNome = quadros[0];
                String numeroCartao = quadros[1];
                Date dataValidadeCartao = sdf.parse(quadros[2]);

                DateFormat df = DateFormat.getDateInstance();
                String dataFormatada = df.format(dataValidadeCartao);

                int numParcelas = Integer.parseInt(quadros[3]);
                double valor = Double.parseDouble(quadros[4]);

                System.out.println("Pagamento" + (i + 1));
                System.out.println("Nome: " + clienteNome);
                System.out.println("Numero do cartão: " + numeroCartao);
                System.out.println("Validade: " + dataFormatada);
                System.out.println("Numero de parcelas: " + numParcelas);
                System.out.println("Valor: " + valor);

                Thread.sleep(1500);

                out.println("Sucesso");
                System.out.println();

            }catch (Exception e) {
                out.println("Ocorreu um erro - " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws Exception {

        new PagamentoServidor().iniciar();
    }
}
