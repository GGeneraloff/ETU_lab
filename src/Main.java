public class Main {
    public static void main(String[] args) {
        double a,b,c,diskr,ans_1,ans_2;
        a=0.0;
        b=0.0;
        c=1.0;
        if (a==0){
            System.out.println("Это не квадратное уравнение");
        }
        else {
            diskr = b * b - 4 * a * c;
            if (diskr == 0) {
                ans_1 = -b / (2 * a);
                System.out.println("Ответ:" + ans_1);
            }
            if (diskr > 0) {
                ans_1 = (-b + Math.sqrt(diskr)) / (2 * a);
                ans_2 = (-b - Math.sqrt(diskr)) / (2 * a);
                System.out.println("Ответ:" + ans_1 + ", " + ans_2);
            }
            if (diskr < 0) {
                System.out.println("Вещественных корней нет((");
            }
        }
        System.out.println("Таблица умножения:");
        int[][] table=new int[11][11];
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++) {
                table[0][j] = j;
                table[i][0] = i;
                table[i][j]=i*j;
            }
        }
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }

    }

}