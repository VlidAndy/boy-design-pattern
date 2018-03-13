package bugmakers.club.dp.structural.seq3.composite.practice;

/**
 * @Description:
 * @Author: Bruce
 * @Datetime: 2018/3/13 11:40
 */
public class Text extends AbstractUIComponent {

    public Text(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        System.out.println("展示" + title + "文本框");
    }
}
