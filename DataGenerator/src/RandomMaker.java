import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomMaker {
    public String createEmail (String s1, String s2)
    {
        String [] tabEndings = {"github.io","gmail.com","gov.com","microsoft.com","dailmail.com","onet.eu","twiiter.com"};
        List<String> endings = new ArrayList<>(Arrays.asList(tabEndings));
        Random rand = new Random();
        int n = rand.nextInt(endings.size());
        s1 = s1 + "qwerty";
        s2 = s2 + "qwerty";
        String email = s1.substring(0,2) + s2.substring(0,6)+"@"+endings.get(n);
        return email.toLowerCase();
    }

    public String createCompanyEmail (String s1)
    {
        String s2 =s1.replaceAll("\\s+","")+"language";
        String email = s2.substring(0,8)+"@gmail.com";
        return email.toLowerCase();

    }


    public String createUniversity()
    {
        String [] uniTab = {"Arizona State University, Downtown Phoenix Campus",
                "American International College",
                "Columbia University",
                "Wilberforce University",
                "Universidade para o Desenvolvimento do Alto Vale do Itajaí",
                "University of Dongola",
                "Cape Coast Polytechnic ",
                "Fundación Universitaria San Martín",
                "Oxford Brookes University",
                "University of Otago",
                "Wollega University",
            "London Business School",
            "Minhaj University Lahore",
            "Universidad Nacional de Ingeniería",
            "Medical University of South Carolina",
            "St. Joseph College",
            "National Kaohsiung First University of Science and Technology",
            "Universidad Nacional de Santa - Chimbote" };
        Random rand = new Random();
        int n = rand.nextInt(uniTab.length-2);
        return uniTab[n];


    }


    public String createPhoneNumber ()
    {
        Random rand = new Random();

        int n1 = rand.nextInt(809) + 101;
        int n2 =  rand.nextInt(809) + 101;
        int n3 = rand.nextInt(804) + 101;
        String phone = Integer.toString(n1) + Integer.toString(n2) + Integer.toString(n3);
        return phone;

    }

    public String createStudentCard ()
    {
        Random rand = new Random();

        int n1 = rand.nextInt(808) + 101;
        int n2 =  rand.nextInt(817) + 101;
        String phone = Integer.toString(n1) + Integer.toString(n2);
        return phone;

    }




    public String createPostalCode ()
    {
        Random rand = new Random();

        int n1 = rand.nextInt(99999) + 10001;
        String p = Integer.toString(n1);
        return p;

    }

    public String smallNumber ()
    {
        Random rand = new Random();
        int n = rand.nextInt (100) + 1;
        String p = Integer.toString(n);
        return p;
    }


    public int chooseConferenceDayPeopleLimit ()
    {
        Random rand = new Random();
        int n = rand.nextInt (20) + 140;
        return n;
    }



    public  String randomString (List<String> list)
    {
        Random rand = new Random();
        int n = rand.nextInt(list.size());
        return list.get(n);
    }
    public String createNip ()
    {
        Random rand = new Random();
        int n = rand.nextInt (9) + 2;
        String nip = Integer.toString(n);
        nip = nip +createPhoneNumber();
        return nip;

    }
    public String chooseLanduage () {
        String[] languages = {"ActionScript", "Ada", "Agilent VEE", "Algol", "Alice", "Angelscript", "Apex", "APL", "AppleScript", "Arc", "Arduino", "ASP", "AspectJ", "Assembly", "ATLAS", "Augeas", "AutoHotkey", "AutoIt", "AutoLISP", "Automator", "Avenue", "Awk", "Bash", "(Visual) Basic", "bc", "BCPL", "BETA", "BlitzMax", "Boo", "Bourne Shell", "Bro", "C", "C Shell", "C#", "C++", "C++/CLI", "C-Omega", "Caml", "Ceylon", "CFML", "cg", "Ch", "CHILL", "CIL", "CL (OS/400)", "Clarion", "Clean", "Clipper", "Clojure", "CLU", "COBOL", "Cobra", "CoffeeScript", "ColdFusion", "COMAL", "Common Lisp", "Coq", "cT", "Curl", "D", "Dart", "DCL", "DCPU-16 ASM", "Delphi/Object Pascal", "DiBOL", "Dylan", "E", "eC", "Ecl", "ECMAScript", "EGL", "Eiffel", "Elixir", "Emacs Lisp", "Erlang", "Etoys", "Euphoria", "EXEC", "F#", "Factor", "Falcon", "Fancy", "Fantom", "Felix", "Forth", "Fortran", "Fortress", "(Visual) FoxPro", "Gambas", "GNU Octave", "Go", "Google AppsScript", "Gosu", "Groovy", "Haskell", "haXe", "Heron", "HPL", "HyperTalk", "Icon", "IDL", "Inform", "Informix-4GL", "INTERCAL", "Io", "Ioke", "J", "J#", "JADE", "Java", "Java FX Script", "JavaScript", "JScript", "JScript.NET", "Julia", "Korn Shell", "Kotlin", "LabVIEW", "Ladder Logic", "Lasso", "Limbo", "Lingo", "Lisp",
                "Logo", "Logtalk", "LotusScript", "LPC", "Lua", "Lustre", "M4", "MAD", "Magic", "Magik", "Malbolge", "MANTIS", "Maple", "Mathematica", "MATLAB", "Max/MSP", "MAXScript", "MEL", "Mercury", "Mirah", "Miva", "ML", "Monkey", "Modula-2", "Modula-3", "MOO", "Moto", "MS-DOS Batch", "MUMPS", "NATURAL", "Nemerle", "Nimrod", "NQC", "NSIS", "Nu", "NXT-G", "Oberon", "Object Rexx", "Objective-C", "Objective-J", "OCaml", "Occam", "ooc", "Opa", "OpenCL", "OpenEdge ABL", "OPL", "Oz", "Paradox", "Parrot", "Pascal", "Perl", "PHP", "Pike", "PILOT", "PL/I", "PL/SQL", "Pliant", "PostScript", "POV-Ray", "PowerBasic", "PowerScript", "PowerShell", "Processing", "Prolog", "Puppet", "Pure Data", "Python", "Q", "R", "Racket", "REALBasic", "REBOL", "Revolution", "REXX", "RPG (OS/400)", "Ruby", "Rust", "S", "S-PLUS", "SAS", "Sather", "Scala", "Scheme", "Scilab", "Scratch", "sed", "Seed7", "Self", "Shell", "SIGNAL", "Simula", "Simulink", "Slate", "Smalltalk", "Smarty", "SPARK", "SPSS", "SQR", "Squeak", "Squirrel", "Standard ML", "Suneido", "SuperCollider", "TACL", "Tcl", "Tex", "thinBasic", "TOM", "Transact-SQL", "Turing", "TypeScript", "Vala/Genie", "VBScript", "Verilog", "VHDL", "VimL", "Visual Basic .NET", "WebDNA", "Whitespace", "X10", "xBase", "XBase++", "Xen", "XPL", "XSLT", "XQuery", "yacc", "Yorick", "Z shell"};
        List<String> listLanguages = new ArrayList<>(Arrays.asList(languages));
        Random rand = new Random();
        int n1 = rand.nextInt(listLanguages.size());
        return listLanguages.get(n1);

    }



    public String createConferenceName (String language)
    {
        String [] prompts = {"10th anniversary of ", "The future of ", "Key to carrer succes - ", "15th anniversary of ",
        "4th international conference on ", "Annual conference on "};

        List<String> listPrompts = new ArrayList<>(Arrays.asList(prompts));
        Random rand = new Random();

        int n2 = rand.nextInt(listPrompts.size());
        String name =  listPrompts.get(n2) + language + " programming language";
        return name;


    }

    public Date addDays (Date starting)
    {
        int dzien = starting.getDay();
        return starting;
    }
    public String chooseWorkshopSubject (String language)
    {
        String [] tabPrompts = {"Business usage of ",
                "Improve your programming skills in ",
                "The secrets of ",
                "Questions You always want to ask about ",
                "Tips and Hints about ",
                "Changes in newest version of ",
                "Object Oriented Programming and ",
                "Procedural Programming and ",
                "Function Programming and "};
        List<String> prompts = new ArrayList<>(Arrays.asList(tabPrompts));
        Random rand = new Random();

        int n2 = rand.nextInt(prompts.size());
        String subject = prompts.get(n2) + language;
        return subject;
    }



}
