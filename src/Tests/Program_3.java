package Tests;

public class Program_3 {
    public static void main(String[] args) {
        // Ускорение свободного падения:
        double g = 9.8;
        double pi = 3.141592;
        // Угол к горизонту (в градусах):
        double alpha = 30;
        // Масса тела (в килограммах):
        double m = 0.1;
        // Коэффициент сопротивления воздуха
        double gamma = 0.1;
        // Скорость тела (в м/с):
        double V = 100.0;
        // Время (в секундах):
        double t = 1.0;
        // Координаты тела (в метрах):
        double x, y;
        //Перевод градусов в радианы:
        alpha /= 180 / pi;
        x = V * m * Math.cos(alpha) / gamma * (1 - Math.exp(-gamma * t / m));
        y = m * (V * Math.sin(alpha) * gamma + m * gamma) / gamma / gamma * (1 - Math.exp(-gamma * t / m)) - m * g * t / gamma;

        System.out.println("Координаты теля для t=" + t + " сек: \nx=" + x + "m\ny=" + y + " m");
        System.out.println("Параметры:");
        System.out.println("Угол alpha=" + alpha/pi*180 + " градусов");
        System.out.println("Скорость V=" + V + " м/с");
        System.out.println("Коэффициент сопротивления gamma=" + gamma + " H*c/m");
        System.out.println("Масса тела м=" + m + " кг");
    }
}
// Полет брошенного под углом к горизонту тела
// для вычисления в указанный момент времени координат тела,
// брошенного под углом к горизонту.
