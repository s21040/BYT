import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Article article = new Article();
        article.setState("111 222 333");
        Caretaker caretaker = new Caretaker(article);
        caretaker.save();
        article.setState(article.getState().replace("1","3"));
        System.out.println(article.state);
        caretaker.revert(article);
        System.out.println(article.state);
        article.setState(article.getState().replace("2","5"));
        System.out.println(article.state);
        article.setState(article.getState().replace("3","5"));
        System.out.println(article.state);
        caretaker.revert(article);
    }
}
class Article {
    public String state;

    static class Snapshot{
        private String state;

        public Snapshot(String state){
            this.state =state;
        }

        public String getState(){
            return state;
        }
    }

    public String getState(){
        return state;
    }

    public Snapshot createState(){
        return new Snapshot(this.getState());
    }

    public void setState(String state){
        this.state=state;
    }

    public void restore(Snapshot pop){
        this.state= pop.getState();
    }
}

class Caretaker{
    public Article article;
    private Stack<Article.Snapshot> stack = new Stack<>();

    public Caretaker(Article article){
        this.article=article;
    }

    public void save() {
        stack.push(article.createState());
    }

    public void revert(Article article) {
        if (!stack.isEmpty()) {
            article.restore(stack.pop());
        }else {
            System.out.println("Cannot undo !");

        }
    }
}
