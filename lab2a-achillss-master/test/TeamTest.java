import org.junit.*;

public class TeamTest {
    public TeamTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void setAndGet() {
        Student student1 = new Student(1234, "Nick");
        Student student2 = new Student(1235, "James");
        Team team = new Team(student1, student2);
        Assert.assertEquals(student1, team.getStudent1());
        Assert.assertEquals(student2, team.getStudent2());

        student1 = new Student(1452, "Maria");
        team.setStudent1(student1);
        Assert.assertEquals(student1, team.getStudent1());

        student2 = new Student(1254, "Mary");
        team.setStudent2(student2);
        Assert.assertEquals(student2, team.getStudent2());

    }

    @Test
    public void testProjects() {
        Student student1 = new Student(1478, "Nick");
        Student student2 = new Student(1236, "James");
        Team team = new Team(student1, student2);
        Assert.assertEquals(3, team.getProject(3));
        Assert.assertEquals(1, team.getProject(2));

        student1 = new Student(1526, "Maria");
        student2 = new Student(1459, "Mary");
        team.setStudent1(student1);
        team.setStudent2(student2);
        Assert.assertEquals(1, team.getProject(3));
        Assert.assertEquals(2, team.getProject(2));
    }

    @Test
    public void testSameLab() {
        Student student1 = new Student(1478, "Nick");
        Student student2 = new Student(1236, "James");
        Team team = new Team(student1, student2);
        Assert.assertFalse(team.sameLab(4));
        student2 = new Student(1458, "Mary");
        team.setStudent2(student2);
        Assert.assertTrue(team.sameLab(4));
        student1 = new Student(1526, "Maria");
        team.setStudent1(student1);
        Assert.assertFalse(team.sameLab(6));
        Assert.assertTrue(team.sameLab(2));

    }
}
