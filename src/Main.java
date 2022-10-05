public class Main {
    public static void main(String[] args) {
        System.out.println(AgeTemperature(26, 15));
        System.out.println(AgeTemperature(29,94));
        System.out.println(AgeTemperature(12,20));
        System.out.println(AgeTemperature(22,34));
        System.out.println(AgeTemperature(21,43));
    }

    public static String AgeTemperature(int age, int temperature) {
        //возраст человека и температуру на улице
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять!";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять!";
        } else if (age > 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять!";
        }else {
            return "Оставайтесь дома";
        }
    }
}