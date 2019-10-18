import org.junit.Test;
import tools.readGedcomFile;
import tools.userStories;

import java.net.URL;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Unit test for user stories.
 */
public class userStoriesTest
{

//            static String testfile = "US01/testOne.ged";
//    private static final String testFilePath = userStoriesTest.class.getResource(testfile).getFile();
//
//    URL url = Thread.currentThread().getContextClassLoader().getResource("US01/testOne.ged");
    String testFilePath = "C:\\Users\\jason\\Documents\\Git\\CS-SSW-555-Group-Project\\src\\main\\resources\\testOne.ged";//relative path is not morking! using your path can run!
    String testUS17 = "/Users/michaelwen/Documents/555/homework/CS-SSW-555-Group-Project/src/main/resources/UserStory17.ged";

    public boolean errorContain(java.util.Set<java.lang.String> errorSet, String errorInfo){
        for (String s : errorSet) {
            if(s.contains(errorInfo))
                return true;
        }
        return false;
    }

    @Test
    public void TestUS01T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US01(Fams,indis);
        assertTrue(errorContain(test.getError(),  "US01"));
    }

    @Test
    public void TestUS01F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US01(Fams,indis);
        assertFalse(errorContain(test.getError(),  "US01"));
    }

    @Test
    public void TestUS02T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),  "US02"));
    }

    @Test
    public void TestUS02F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US02") );
    }

    @Test
    public void TestUS03T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        test.IterateInds(read.printFam(),read.printIndi());
        assertTrue(errorContain(test.getError(),"Error US03") );
    }

    @Test
    public void TestUS03F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        test.IterateInds(read.printFam(),read.printIndi());
        assertFalse(errorContain(test.getError(),"Error US03") );
    }

    @Test
    public void TestUS04F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US04") );
    }

    @Test
    public void TestUS04T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US04") );
    }

    @Test
    public void TestUS05T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US05") );
    }

    @Test
    public void TestUS05F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US05") );
    }

    @Test
    public void TestUS06F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US06") );
    }

    @Test
    public void TestUS06T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US06") );
    }

    @Test
    public void TestUS07T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateInds(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US07") );
    }

    @Test
    public void TestUS07F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateInds(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US07") );
    }

    @Test
    public void TestUS08T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US08") );
    }

    @Test
    public void TestUS08F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US08") );
    }

    @Test
    public void TestUS09T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US09") );
    }

    @Test
    public void TestUS09F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US09") );
    }

    @Test
    public void TestUS10T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US10") );
    }

    @Test
    public void TestUS10F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US10") );
    }

    @Test
    public void TestUS11T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US11") );
    }

    @Test
    public void TestUS11F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US11") );
    }

    @Test
    public void TestUS12T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US12") );
    }

    @Test
    public void TestUS12F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US12") );
    }

    @Test
    public void TestUS13T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error: US13") );
    }

    @Test
    public void TestUS13F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error: US13") );
    }

    @Test
    public void TestUS14T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error: US14") );
    }

    @Test
    public void TestUS14F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.US10(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error: US14") );
    }

    @Test
    public void TestUS15T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US15") );
    }

    @Test
    public void TestUS15F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US15") );
    }

    @Test
    public void TestUS16T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"ERROR: FAMILY: US16: F2 male members don`t have same last name.") );
    }

    @Test
    public void TestUS16F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"ERROR: FAMILY: US16: F2 male members don`t have same last name.") );
    }

    @Test
    public void TestUS17T() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testUS17);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US17") );
    }

    @Test
    public void TestUS17F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testUS17);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US17") );
    }

    @Test
    public void TestUS18T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"Error US08") );
    }

    @Test
    public void TestUS18F() throws Exception {
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"Error US08") );
    }

    @Test
    public void TestUS19T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"ERROR: FAMILY: US19") );
    }

    @Test
    public void TestUS19F() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"ERROR: FAMILY: US19") );
    }

    @Test
    public void TestUS20T() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertTrue(errorContain(test.getError(),"ERROR: FAMILY: US20: F1 : niece: I1 married uncle: I1") );
    }

    @Test
    public void TestUS20F() throws Exception {
//        System.out.println(url.getPath());
        readGedcomFile read = new readGedcomFile();
        read.readFile(testFilePath);
        userStories test = new userStories();
        Map indis = read.printIndi();
        Map Fams = read.printFam();
        test.IterateFam(Fams,indis);
        assertFalse(errorContain(test.getError(),"ERROR: FAMILY: US20: F1 : niece: I1 married uncle: I1") );
    }

}
