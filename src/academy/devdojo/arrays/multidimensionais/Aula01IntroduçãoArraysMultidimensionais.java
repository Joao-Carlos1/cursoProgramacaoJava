package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroduçãoArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
        arrayMulti[0][0] = 11;
        arrayMulti[0][1] = 22;
        arrayMulti[0][2] = 66;
        arrayMulti[1][0] = 33;
        arrayMulti[1][1] = 44;
        arrayMulti[1][2] = 77;
        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[0][2]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);
        System.out.println(arrayMulti[1][2]);
    }
}
