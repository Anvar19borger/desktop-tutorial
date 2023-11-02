package practice;

public enum MenuOption {
    ADD(1, "Добавить запись"),
    VIEW(2, "Посмотреть все записи"),
    DELETE(3, "Удалить запись (по номеру)"),
    EXIT(4, "Выйти");

    private final int value;
    private final String description;

    MenuOption(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
