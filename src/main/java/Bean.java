public class Bean implements IBean {
    public int    id;
    public String value;

    public Bean(int id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
