//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

static int [][] numeros = new int[4][4];
void main() {
  System.out.println("Rellename todos los numeros");
rellenarnumeros();
System.out.println(Arrays.deepToString(numeros));

}
private static void rellenarnumeros(){
    Scanner dc = new Scanner(System.in);
    System.out.println("Primera fila");
    for (int x = 0; x < numeros.length; x++){
    numeros[0][x] = dc.nextInt();
    }
    System.out.println("Segunda fila");
    for (int x = 0; x < numeros.length; x++){
        numeros[1][x] = dc.nextInt();
    }
    System.out.println("Tercera fila");
    for (int x = 0; x < numeros.length; x++){
        numeros[2][x] = dc.nextInt();
    }
    System.out.println("Cuarta fila");
    for (int x = 0; x < numeros.length; x++){
        numeros[3][x] = dc.nextInt();
    }

}
private static void sumarcolumna(){
    Scanner dc = new Scanner(System.in);
    System.out.println("dime que columna quieres sumar entre 1 y 4");
    int filaSumNum = dc.nextInt();
    filaSumNum = filaSumNum - 1;
    for (int x = 0; x < numeros.length; x++){

    }
}