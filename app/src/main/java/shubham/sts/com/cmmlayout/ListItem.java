package shubham.sts.com.cmmlayout;

public class ListItem {

    String subject;
    int progress;

    public ListItem(String subject, int progress) {
        this.subject = subject;
        this.progress = progress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
