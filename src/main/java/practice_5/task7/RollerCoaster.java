package practice_5.task7;

public class RollerCoaster extends Attraction{
    @Override
    public String info() {
        return "Острые ощущения испытываешь на американских горках";
    }
    @Override
    public void maintain() {
        System.out.println("Американским горкам необходима проверка безопастности");
    }
}
