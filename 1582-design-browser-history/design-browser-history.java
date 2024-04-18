class Page{
    String url;
    Page back;
    Page forward;

    public Page(String url)
    {
        this.url= url;
        back=forward= null;
    }
}
class BrowserHistory {
    Page HomePage;
    Page curPage;
    public BrowserHistory(String homepage) {
        HomePage= new Page(homepage);
        curPage=HomePage; 
    }
    
    public void visit(String url) {
        Page newPage= new Page(url);
        curPage.forward= newPage;
        newPage.back= curPage;
        curPage= newPage;
    }
    
    public String back(int steps) {
        while(curPage.back!=null && steps>0)
        {
            curPage=curPage.back;
            steps--;
        }
        return curPage.url;
    }
    
    public String forward(int steps) {
        while(curPage.forward!=null && steps>0)
        {
            curPage=curPage.forward;
            steps--;
        }        
        return curPage.url;

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */