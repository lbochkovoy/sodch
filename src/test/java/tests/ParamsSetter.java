package tests;

import objects.Kusp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

public class ParamsSetter {
    public static String[] getTestParams( String environmentName ){
        String fileName = "src\\main\\resources\\"+environmentName+".properties";

        String login = new String();
        String password = new String();
        String url = new String();

        Properties prop = new Properties();
        try (InputStream testParams = new FileInputStream("src\\main\\resources\\test2.properties")) {
            prop.load(new InputStreamReader( testParams, Charset.forName("UTF-8")));

            login = prop.getProperty("login");
            password = prop.getProperty("password");
            url = prop.getProperty("URL");

        }
        catch( IOException exception ){
            exception.printStackTrace();
        }

        String[] result = { login, password, url };

        return result;

    }

    public static ArrayList< Kusp > getKusps() {
        ArrayList<Kusp> kusps = new ArrayList<Kusp>();

        Properties propertiesMaster = new Properties();
        try (InputStream kuspStream = new FileInputStream("src\\main\\resources\\kusp.properties")) {
            propertiesMaster.load(new InputStreamReader(kuspStream, Charset.forName("UTF-8")));

            Kusp kusp1 = new Kusp();
            kusp1.setLastName(propertiesMaster.getProperty("lastName1"));
            kusp1.setFirstName(propertiesMaster.getProperty("firstName1"));
            kusp1.setPatronymic(propertiesMaster.getProperty("patronymic1"));
            kusp1.setPhone(propertiesMaster.getProperty("phone1"));
            kusp1.setPlot(propertiesMaster.getProperty("plot1"));
            kusp1.setApplicationForm(propertiesMaster.getProperty("applicationForm1"));

            Kusp kusp2 = new Kusp();
            kusp2.setLastName(propertiesMaster.getProperty("lastName2"));
            kusp2.setFirstName(propertiesMaster.getProperty("firstName2"));
            kusp2.setPatronymic(propertiesMaster.getProperty("patronymic2"));
            kusp2.setPhone(propertiesMaster.getProperty("phone2"));
            kusp2.setPlot(propertiesMaster.getProperty("plot2"));
            kusp2.setApplicationForm(propertiesMaster.getProperty("applicationForm2"));

            Kusp kusp3 = new Kusp();
            kusp3.setLastName(propertiesMaster.getProperty("lastName3"));
            kusp3.setFirstName(propertiesMaster.getProperty("firstName3"));
            kusp3.setPatronymic(propertiesMaster.getProperty("patronymic3"));
            kusp3.setPhone(propertiesMaster.getProperty("phone3"));
            kusp3.setPlot(propertiesMaster.getProperty("plot3"));
            kusp3.setApplicationForm(propertiesMaster.getProperty("applicationForm3"));

            kusps.add(kusp1);
            kusps.add(kusp2);
            kusps.add(kusp3);

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return kusps;
    }
}
