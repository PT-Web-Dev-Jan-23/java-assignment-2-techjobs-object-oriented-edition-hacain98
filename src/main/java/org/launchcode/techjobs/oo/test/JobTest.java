package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job3.getName(), "Product tester");
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");

        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n", job1.toString().substring(job1.toString().length() - 1));
        assertEquals("\n", job1.toString().substring(0,1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job1String = job1.toString();
        String testString = "\n" +
                "ID: ____" + job1.getId() + "____\n" +
                "Name: ____" + "Product tester" + "____\n" +
                "Employer: ____" + "ACME" + "____\n" +
                "Location: ____" + "Desert" + "____\n" +
                "Position Type: ____" + "Quality control" + "____\n" +
                "Core Competency: ____" + "Persistence" + "____\n";
        assertEquals(job1String, testString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        String job1String = job1.toString();
        String emptyField = "";
        String testString = "\n" +
                "ID: ____" + job1.getId() + "____\n" +
                "Name: ____" + "Product tester" + "____\n" +
                "Employer: ____" + "ACME" + "____\n" +
                "Location: ____" + "Desert" + "____\n" +
                "Position Type: ____" + "Quality control" + "____\n" +
                "Core Competency: ____" + emptyField + "____\n";
        assertEquals(job1String, testString);
    }
}