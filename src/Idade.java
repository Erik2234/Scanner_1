import java.util.Scanner;

public class Idade
{
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        {
            System.out.println("Digite seu Nome");
            String nome = Teclado.nextLine();
            {
                System.out.println("Digite sua idade");
                int idade = Teclado.nextInt();
                {
                    System.out.println("Digite sua Data de Nascimento");
                    long data = Teclado.nextLong();
                    {
                        System.out.print("Nome: " + nome + "\n" + " Idade: " + idade + "\n" + "Data de Nascimento: " + data);

                    }
                }
            }
        }
    }
    }



