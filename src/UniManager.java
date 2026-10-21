import java.util.Scanner;

abstract class Person 
{
    public String Name;
    public String ID;

    public void displayBasicDetails()
    {
        System.out.println("\n-- Basic Details --");
        System.out.println("Name                 : " + Name);
        System.out.println("ID                   : " + ID);
    }
}

abstract class Student extends Person implements ScholarshipEligible
{
    public String Department;
    public int Semester;
    public float[] Marks;

    public abstract int getSubjectCount();
    public abstract float getMinMarks();

    public void inputMarks()
    {
        Scanner sc = new Scanner(System.in);
        int subjectCount = getSubjectCount();
        Marks = new float[subjectCount];

        System.out.println("\n- Enter Marks for the Subjects - ");
        for(int i = 0; i < subjectCount; i++)
        {
            System.out.print(" - Subject " + (i + 1) + ": ");
            Marks[i] = sc.nextFloat();
        }
    }


    public boolean calculateGrade()
    {
        if(Marks == null) inputMarks();

        int subjectCount = getSubjectCount();
        float minMarks = getMinMarks();

        for(int i = 0; i < subjectCount; i++)
        {
            if(Marks[i] < minMarks)
                return false;
        }

        return true;
    }

    public float getAverageMarks()
    {
        if(Marks == null) inputMarks();
        int subjectCount = getSubjectCount();

        float totalMarks = 0;
        for(int i = 0; i < subjectCount; i++)
            totalMarks += Marks[i];

        return totalMarks / subjectCount;
    }
}

interface ScholarshipEligible 
{
    public boolean checkScholarshipEligibility();
}

class UndergraduateStudent extends Student
{
    @Override
    public int getSubjectCount()
    {
        return 5;
    }

    @Override
    public float getMinMarks()
    {
        return 40;
    }

    @Override
    public boolean checkScholarshipEligibility()
    {
        return getAverageMarks() > 0.8f && calculateGrade();
    }
}

class PostgraduateStudent extends Student 
{
    @Override
    public int getSubjectCount()
    {
        return 4;
    }

    @Override
    public float getMinMarks()
    {
        return 50;
    }

    @Override
    public boolean checkScholarshipEligibility()
    {
        return getAverageMarks() > 0.85f && calculateGrade();
    }
}

class UniManager 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("--- Student Creator ---");
            System.out.print(" - Enter 0 for UG 1 for PG: ");

            Student student;

            int pg = sc.nextInt();
            if(pg == 1)
                student = new PostgraduateStudent();
            else 
                student = new UndergraduateStudent();

            sc.nextLine();

            System.out.print(" - Name: ");
            student.Name = sc.nextLine();

            System.out.print(" - ID: ");
            student.ID = sc.nextLine();

            System.out.print(" - Department: ");
            student.Department = sc.nextLine();

            System.out.print(" - Semester: ");
            student.Semester = sc.nextInt();

            student.inputMarks();

            student.displayBasicDetails();
            System.out.println("Department           : " + student.Department);
            System.out.println("Semester             : " + student.Semester);
            System.out.println("Passed?              : " + student.calculateGrade());
            System.out.println("ScholarshipEligible? : " + student.checkScholarshipEligibility());
            System.out.println();
        }
    }
}