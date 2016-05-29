package Controllers;

import Conn.ServerConn;
import sample.Main;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public abstract class AbstractController {
    public void setApp(Main app) {
        this.app = app;
    }

    Main app;

    protected ServerConn server = new ServerConn();
}
