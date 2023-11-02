package practice.month;

public enum Month {
    JAN("January", 31), FEB("February", 28), MAR("March", 31), APR("April", 30), MAY("May", 31),
    JUN("June", 30), JUL("July", 31), AUG("August", 31), SEP("Sepember", 30), OCT("October", 31),
    NOV("November", 30), DEC(" December", 31);

    // pole
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
    // Задайте emun Month, определите месяца, их наименования и количество в них дней.
    //  Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //  Пример: AUG + 6 month = FEB
    // Проверьте работу метода в приложении.

    // Metod dlja uvilichenie  kol va mesecov
    public Month plusMonth(int quantity){
        int index = ordinal();//  vsjali tekuschii nomer mesjaca
        index = index +quantity;// uveelicheli kolischeestvo mesecev
        Month[] months = values();// vse constanti v nosimm v masiv tipa Month
        int res = index % months.length;// vicheslili nomer meseca posle prebovlenija qvanteti
        return  months[index % months.length];// vosvraschjaem obekt tipa Month,  indeeex kotorogo = % 12

    }

}
