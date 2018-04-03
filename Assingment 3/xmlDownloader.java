import javax.swing.*;
import java.awt.*;


public class xmlDownloader extends JFrame {


    public xmlDownloader(){
        createAndShowGUI();
        setTitle("iTunes Store Albums");
        setSize(new Dimension(800,500));
        setVisible(true);
    }

    //Creates and displays the gui
    public void createAndShowGUI() {

        //initialize variables
        menuBar = new JMenuBar();
        showAlbums = new JTextArea();
        Type = new JMenu("Type");
        Limit = new JMenu("Limit");
        Explicit = new JMenu("Explicit");
        newMusicOption = new JMenuItem("New Music");
        recentMusicOption = new JMenuItem("Recent Music");
        topAlbumsOption = new JMenuItem("Top Albums");
        tenOption = new JMenuItem("10");
        twentyFiveOption = new JMenuItem("25");
        fiftyOption = new JMenuItem("50");
        oneHundOption = new JMenuItem("100");
        yesOption = new JMenuItem("Yes");
        noOption = new JMenuItem("No");
        setLayout(new BorderLayout());

        //add menubar to frame
        menuBar.add(Type);
        menuBar.add(Limit);
        menuBar.add(Explicit);
        Type.add(newMusicOption);
        Type.add(recentMusicOption);
        Type.add(topAlbumsOption);
        Limit.add(tenOption);
        Limit.add(twentyFiveOption);
        Limit.add(fiftyOption);
        Limit.add(oneHundOption);
        Explicit.add(yesOption);
        Explicit.add(noOption);
        add(menuBar, BorderLayout.NORTH);

        add(new xmlDownloaderPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new xmlDownloader();
            }
        });

    }

    //Private members

    private JMenuBar menuBar;
    private JTextArea showAlbums;
    private JMenu Type;
    private JMenu Limit;
    private JMenu Explicit;
    private JMenuItem newMusicOption;
    private JMenuItem recentMusicOption;
    private JMenuItem topAlbumsOption;
    private JMenuItem tenOption;
    private JMenuItem twentyFiveOption;
    private JMenuItem fiftyOption;
    private JMenuItem oneHundOption;
    private JMenuItem yesOption;
    private JMenuItem noOption;

}