public class Main {
    public static void main(String[] args) {
        {//Задание 1
            var i = 1;
            while (i <= 10 && i >= 1) {
                System.out.printf("%d ", i);
                i++;
            }
            System.out.println();
            for (i = 10; i >= 1; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

        {//Задание 2
            var friday = 3;
            for (var day = friday; day <= 31; day++)
                if ((day - friday) % 7 == 0)
                    System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", day);
        }

        {//Задание 3
            for (var year = 1800; year <= 2100; year++)
                if (year % 79 == 0)
                    System.out.println(year);
        }

        {//Задание 4
            var status = "";
            for (var i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) status = "ping pong";
                else if (i % 5 == 0) status = "pong";
                else if (i % 3 == 0) status = "ping";
                else status = "";
                System.out.println(i + ": " + status);
            }
        }

        {//Задание 5
            int x = 0, y = 1, z = 0;
            System.out.printf("%d ", x);
            for (var i = 0; i <= 8; i++) {
                x = y;
                y = z;
                z = x + y;
                System.out.printf("%d ", z);
            }
        }
    }
}
