package practice.json_wrapper;

// imja :Leanid, vosrost: 59- eto danie v odnoi programme
// {name: Leonid, age: 59} - eto iest Json, kotorii peredajut drugoi programme i ona ego mojet "prochitat"(parsing)


public class JsonWrapper1 {

    // oprediljaetsja polja klassa
    private Object value;

    // konstruktor
    public JsonWrapper1(Object value) {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";

    }
}
