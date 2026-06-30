
interface HttpService{

    void handleHttpRequest();

}


interface DatabaseManager{

    void executeSqlStatement();

}



class WebController implements HttpService{


    public void handleHttpRequest(){

        System.out.println("HTTP");

    }

}



class DatabaseServer implements DatabaseManager{


    public void executeSqlStatement(){

        System.out.println("SQL");

    }

}



public class Main6{


    public static void main(String[] args){


        WebController w =
        new WebController();


        w.handleHttpRequest();



        DatabaseServer d =
        new DatabaseServer();


        d.executeSqlStatement();


    }

}
