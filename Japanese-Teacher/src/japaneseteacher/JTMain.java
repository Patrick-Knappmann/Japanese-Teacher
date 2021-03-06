/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japaneseteacher;

import DAO.FlashCardDAO;
import Util.DBUtil;
import handlers.FlashCardHandler;
import view.StageController;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Patrick
 */
public class JTMain {

    private FlashCardHandler flashCardHandler;
    private FlashCardCatalog flashCardCatalog;
    private FileHandler fileHandler;
    private StageController stageController;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JTMain jt = new JTMain(args);
    }

    public JTMain(String[] args) {
        fileHandler = new FileHandler();
        flashCardCatalog = new FlashCardCatalog(fileHandler);
        flashCardHandler = new FlashCardHandler(flashCardCatalog);
//        flashCardCatalog.create("yes", "hai", "はい", "犬", "To approve");
//        flashCardCatalog.create("no", "iie", "いいえ", "猫", "To disagree");
//        flashCardCatalog.create("Friend", "tomodachi", "ともだち", "友達", "A person you have a mutually positive relationship with");
//        System.out.println(flashCardCatalog.getFlashCards());
//        System.out.println("Pending Cards");
//        flashCardCatalog.newUser("Patrick");
//        System.out.println(flashCardCatalog.getPendingFlashCards("Patrick", "English to japanese"));
        stageController = new StageController(flashCardHandler);
        stageController.launchGUI(args);
        
    }
}
