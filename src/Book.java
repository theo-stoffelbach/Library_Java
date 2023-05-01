public class Book {
    protected String m_title;
    protected String m_author;
    protected int m_pages;
    protected int m_date;

    public Book(String title, String author, int pages, int date) {
        this.m_title = title;
        this.m_author = author;
        this.m_pages = pages;
        this.m_date = date;
    };

    public void show() {
        System.out.println("--- " + m_title + " --- \n" + m_author + "\n" + m_pages + "\n" + m_date);
    }
}
