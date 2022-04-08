public class Utilidades {

    static int a = 20;
    static int b = 10;

    static void verificação(){
        if(a == b){
            System.out.println("é igual");
        } else{
            System.out.println("não é igual");
        }
    }

   static void igualar(){
        while(a != b){
            System.out.println(b);
            b ++;
        }
    }

   static void foR(){
        for(int i = 50;i > 10; i--){
        System.out.println(i);
        }
    }

}
