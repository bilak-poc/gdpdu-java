import com.opencore.gdpdu.index.annotations.Column;

public class TestModel {

  @Column("foo")
  private String foo;

  @Column("bar")
  private int bar;

  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  public int getBar() {
    return bar;
  }

  public void setBar(int bar) {
    this.bar = bar;
  }
}
