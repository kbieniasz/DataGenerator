import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {




    public static void main(String[] args) throws ParseException, IndexOutOfBoundsException, FileNotFoundException {
        PrintWriter outWriter = new PrintWriter("C:\\Users\\Admin\\Desktop\\DataToDatebase2.txt");

        RandomMaker r = new RandomMaker();
        System.out.println("Hello World!");
        String [] tabFirstNames =  {"Dagny" ,"Ashley",  "Zack",  "Wilhelm",  "Karry",  "Branden",  "Yevette",  "Melamie",  "Ema",  "Augustine",  "Gennifer",  "Christiano",  "Wilma",  "Louisette",  "Peadar",  "Sigrid",  "Kenna",  "Selig",  "Tulley",  "Adrian",  "Neysa",  "Berna",  "Amye",  "Harcourt",  "Harper",  "Gae",  "Francisca",  "Loutitia",  "Siward",  "Aubrette",  "Gabbie",  "Adham",  "Fin",  "Maximilien",  "Melissa",  "Aliza",  "Scarlett",  "Savina",  "Ruprecht",  "Bertha",  "Idaline",  "Wilt",  "Michaelina",  "Rozelle",  "Cele",  "Honoria",  "Rip",  "Luisa",  "Trudi",  "Weidar",  "Leodora",  "Fawnia",  "Susie",  "Mollee",  "Gregoor",  "Matthieu",  "Enrique",  "Sandro",  "Gusty",  "Sheela",  "Yul",  "Friedrick",  "Jeramie",  "Vale",  "Hilliary",  "Odessa",  "Neale",  "Octavia",  "Desiree",  "Decca",  "Rianon",  "Fred",  "Cathrine",  "Roosevelt",  "Rolph",  "Jolyn",  "Florina",  "Devonne",  "Gerry",  "Gaspard",  "Noll",  "Kevon",  "Randie",  "Ailee",  "Timothea",  "Darbie",  "Symon",  "Monroe",  "Nikoletta",  "Dorine",  "Happy",  "Annabel",  "Charlene",  "Lyndy",  "Laurie",  "Spense",  "Engelbert",  "Nisse",  "Noby",  "Trenton"};
        List<String> listFirstNames = new ArrayList<>(Arrays.asList(tabFirstNames));
        String [] tabLastNames = {"Bonefant",  "Macklam",  "Surgener",  "Romanin",  "Itzcovich",  "Ghirigori",  "Gipp",  "Botterman",  "Caplan",  "Milbank",  "Henriques",  "Joost",  "Beale",  "Enderwick",  "Muscat",  "Noir",  "Middlemass",  "Fonzone",  "Billett",  "Moralas",  "Shurey",  "Twallin",  "Maneylaws",  "Peartree",  "Kits",  "Cuell",  "Dallin",  "Kornes",  "Niemiec",  "Harner",  "Tilt",  "Simond",  "Pawels",  "Hoodlass",  "Papworth",  "Fetherby",  "Brucker",  "Lukock",  "MacCallister",  "Szach",  "Gallant",  "Quinane",  "Temlett",  "Marritt",  "Jirick",  "Rushmare",  "Bauckham",  "McGinney",  "Lukes",  "Kield",  "Belderson",  "Stanger",  "Hollingby",  "Sieur",  "Pelos",  "Du Pre",  "Dotson",  "Stitch",  "Wimbridge",  "Banbury",  "Pedroli",  "Handscombe",  "Gianolo",  "Marzelli",  "Abrahamoff",  "Bridgman",  "Farrey",  "Ginnane",  "Pattemore",  "Mazin",  "Muller",  "Kinkaid",  "Copnell",  "Rawsthorne",  "Troke",  "Goaks",  "Madre",  "Flippini",  "Sergison",  "Ley",  "Blasdale",  "Temperton",  "Alessandone",  "Weddup",  "Litt",  "Terzza",  "Cadogan",  "Ipplett",  "Ismail",  "Layne",  "Franzonello",  "Cappineer",  "Muffen",  "Perrins",  "Carwithan",  "Simonaitis",  "Girth",  "Lanfranconi",  "Shurmer",  "Flight",  "McTrustie",  "Stitle",  "Wrixon",  "Greenier",  "Benne",  "Kamena",  "Dani",  "Leggate",  "Bradly",  "Wakely",  "McGlew",  "Abrashkin",  "Abate",  "Dearle",  "Docherty",  "Dwyr",  "Dennis",  "Jurasek",  "Emanueli",  "Dehn",  "Raittie",  "Codi",  "Dacre",  "Somersett",  "Goodread",  "Walsham",  "Leggett",  "Lyttle",  "Corran",  "Becke",  "Carette",  "Eadmeades",  "Grushin",  "Neylan",  "Schermick",  "Tolle",  "Labbet",  "Shouler",  "McRobert",  "Shaw",  "Goldstein",  "Itzchaky",  "Dunhill",  "Rraundl",  "Shaw",  "Groome",  "De Beauchamp",  "MacQuarrie",  "Hartnell",  "Naisbet",  "Pisculli",  "Yewdall",  "Alster",  "Brissenden",  "Pudge",  "Crace",  "Gillmor",  "Dunkerk",  "Acutt",  "Pledger",  "Hoffner",  "Kaser",  "Cristofori",  "Lennarde",  "Dalley",  "Demaid",  "Onyon",  "Sollas",  "Jeffcoat",  "Kellar",  "Craigg",  "Worrell",  "Gallaher",  "Meachen",  "Biford",  "Bowkley",  "Leverton",  "Alenin",  "Renahan",  "Moine",  "O'Breen",  "Budgeon",  "Messager",  "Spyby",  "Heap",  "McComiskey",  "Perassi",  "Smout",  "Hewkin",  "Mallock",  "Hartman",  "Kliement",  "Stenning",  "Kirvin",  "Keelinge",  "Rawstron",  "Breddy",  "ducarme",  "Tattersill",  "Kauscher",  "Currie",  "Demare",  "Gerasch",  "Winyard",  "Paullin",  "Wagstaff",  "Whitmell",  "Kidby",  "Davenhall",  "Humphrey",  "Fawssett",  "Erbe",  "Wallace",  "Wrightam",  "Blade",  "Merner",  "Postans",  "Bretton",  "Kenelin",  "Wardle",  "Cudworth",  "Tembridge",  "Audus",  "Hatrey",  "Skurray",  "De Domenici",  "Eady",  "Bleakman",  "Plevey",  "Ivain",  "Pantridge",  "Lotterington",  "Vallerine",  "Wagg",  "Sugg",  "Ruffler",  "Belone",  "Rosenhaupt",  "Feitosa",  "Billham",  "Waith",  "Ranklin",  "Wilber",  "Kunze",  "Lasty",  "Filippi",  "Vanyakin",  "Yabsley",  "McRavey",  "Roakes",  "Nutting",  "Leward",  "Bage",  "Pervew",  "Isaksen",  "Ferrero",  "Jee",  "Risborough",  "De Robertis",  "Code",  "Pybus",  "Stabler",  "Cleaves",  "Walder",  "Rands",  "Hardage",  "Clowney",  "Farra",  "Husher",  "Bowie",  "Chedzoy",  "Gerbl",  "Klasen",  "Tigwell",  "Copes",  "Hugnot",  "Monnoyer",  "Langdon",  "Halgarth",  "Maingot",  "Lehmann",  "Dilks",  "Sicha",  "Sands",  "Hayhoe",  "Warre",  "Goldie",  "Vannacci",  "Ambrois",  "Blackboro",  "Dixie",  "Tebbe",  "Martinson",  "Sushams",  "Gero",  "Scripture",  "Eakin",  "Ilson",  "Tisor",  "Kybbye",  "Moubray",  "Bowie",  "Ferri",  "McNaughton",  "Tabour",  "Holdren",  "Huntingdon",  "McCleary",  "Maggiori",  "Bernucci",  "Eger",  "Sidnall",  "Carlill",  "Burrows",  "Dewsnap",  "Lillegard",  "Whitters",  "Teasey",  "Midford",  "Klimowicz",  "Lovatt",  "Parnby",  "Flobert",  "Recher",  "Wingham",  "Poupard",  "Giampietro",  "Brickner",  "Aleksahkin",  "Lovewell",  "Spiteri",  "Bleasdale",  "Lathleiff",  "Glasard",  "Semmens",  "Swadon",  "Slade",  "Pock",  "Frankom",  "Myhan",  "Schneidar",  "Grinyov",  "Minithorpe",  "Chamley",  "Ephson",  "Joice",  "Partener",  "Robertacci",  "Chelam",  "Croisdall",  "McOrkill",  "Vasilic",  "Allawy",  "Lorenzetto",  "Sevior",  "Craze",  "Elldred",  "Phoebe",  "Odda",  "Kingsly",  "MacInnes",  "Hellis",  "Pettiford",  "Proffer",  "Semiraz",  "Douse",  "Potte",  "Lownds",  "Pendlington",  "Wall",  "Piccop",  "Cissell",  "Noteyoung",  "Jerdon",  "Ricardon",  "Gyurkovics",  "Hugill",  "Rittmeyer",  "Imort",  "Mapis",  "Pellett",  "Lovekin",  "Cloke",  "Ochterlony",  "Garretts",  "Bilverstone",  "Champain",  "Flohard",  "Morey",  "Bryett",  "Radeliffe",  "Dellit",  "Brice",  "Toler",  "Tovey",  "Huskisson",  "Deavall",  "Kerry",  "Meran",  "Portman",  "Stiegars",  "Alanbrooke",
                "Eastcott",  "Andrelli",  "Carrodus",  "Kings",  "Kilcoyne",  "Brewett",  "Berkely",  "Greasley",  "Holtaway",  "Smalcombe",  "Bligh",  "Cattermoul",  "Bonicelli",  "Eeles",  "Norres",  "Gurnell",  "Audsley",  "Hillitt",  "Legrave",  "Brookz",  "Grosier",  "Glowacha",  "Blaker",  "Lamminam",  "Roydon",  "Thompstone",  "Western",  "O'Leagham",  "Oaker",  "Tapson",  "Tankin",  "Karlolak",  "Seegar",  "Sennett",  "Mauditt",  "Derisley",  "Grieg",  "McNeigh",  "Lambarton",  "Govier",  "Bimson",  "Duerden",  "Foote",  "Lobley",  "Rowbotham",  "Le Claire",  "Dargie",  "Richold",  "Stadding",  "Cankett",  "Bernhard",  "Graalman",  "Yuryichev",  "de Mullett",  "Bratt",  "Faas",  "Sarle",  "Collomosse",  "Stiff",  "Candish",  "Gary",  "Prudham",  "Dulany",  "Whapples",  "Iddiens",  "Cruz",  "Gorman",  "Gut",  "MacCumiskey",  "Bollans",  "Liebmann",  "Aspinal",  "Midgley",  "Gorini",  "Glading",  "Doghartie",  "Aliberti",  "Coxon",  "Gniewosz",  "Oddey",  "De Ferrari",  "Sivill",  "Thecham",  "Laffan",  "Zupo",  "Marking",  "Panyer",  "Jowle",  "Pickless",  "Deverock",  "Fennessy",  "Worner",  "O'Deoran",  "Jacobowicz",  "Askam",  "Brinkley",  "Parffrey",  "Weild",  "Levinge",  "Woolstenholmes",  "Bolgar",  "Farenden",  "Frude",  "Broek",  "MacPhaden",  "Blazek",  "Vedekhin",  "Widocks",  "Baistow",  "Atack",  "Scholard",  "Drydale",  "Le febre",  "Huxham",  "Billiard",  "Cartmail",  "Menhci",  "Ropars",  "Whyard",  "Rumin",  "Stanbridge",  "Trotter",  "Stanbury",  "Joslyn",  "Bayne",  "Pudner",  "Glazyer",  "Rammell",  "Cheatle",  "Milesap",  "Naulls",  "Axworthy",  "Choldcroft",  "Flack",  "Dellenbroker",  "Demangel",  "Levene",  "Leban",  "Padillo",  "Yakovlev",  "Grouer",  "Shutle",  "Lindstedt",  "Tivolier",  "Marquet",  "Lindfors",  "Braffington",  "Crimpe",  "Dysert",  "Grunwall",  "Avrasin",  "Habbert",  "Clifton",  "Lathleiffure",  "Skipton",  "Butter",  "Finicj",  "Igounet",  "Blincoe",  "Kamena",  "Badini",  "Jeroch",  "Jaume",  "Cino",  "Faley",  "Grubbe",  "Royal",  "Yakobowitz",  "Weighell",  "Possa",  "Hodcroft",  "Locket",  "Gianettini",  "Curmi",  "Cribbins",  "Skeates",  "Hollyard",  "Dy",  "Cleary",  "Blowfield",  "Balderstone",  "Vasnetsov",  "Copping",  "Willmont",  "Kerford",  "Brendel",  "Kenewel",  "Kilshaw",  "Micklem",  "Soan",  "Chaves",  "Amiable",  "Hardisty",  "Vigors",  "Floweth",  "Ricciardi",  "Annies",  "Lanfranconi",  "Kennealy",  "Fedder",  "Champkins",  "Gannicleff",  "Vaughten",  "Mollett",  "Elmore",  "Tod",  "Sidary",  "Beany",  "Hought",  "Iredale",  "Siddle",  "Rockall",  "Prandini",  "Westman",  "Mansuer",  "Struttman",  "Blackborn",  "Arkill",  "Merricks",  "Etter",  "Richardsson",  "Darkins",  "Caudle",  "Riddall",  "Tylor",  "Keam",  "Harmson",  "Bauman",  "Whitrod",  "Mainland",  "Gavigan",  "Sharphouse",  "Wikey",  "Balassi",  "Georgeon",  "Gouge",  "Manis",  "Girdler",  "Elener",  "Craik",  "Butterly",  "Denington",  "Flowith",  "Paradise",  "Tribe",  "Sackey",  "Van der Kruijs",  "Wimmers",  "Giannazzo",  "Radley",  "Whitewood",  "Morstatt",  "Capstake",  "Rentcome",  "Funnell",  "Ordemann",  "Wherry",  "Sherwen",  "Taffley",  "Scoggan",  "McPhater",  "Ioselev",  "Kliment",  "Brammer",  "Fritter",  "Eatherton",  "Mowen",  "Deerr",  "Kermath",  "Cops",  "Sultan",  "Lukovic",  "Ector",  "Ruck",  "Ervin",  "Dovidaitis",  "Varden",  "Carslake",  "Axton",  "Sarfatti",  "Bryett",  "Meadmore",  "Druery",  "Wingatt",  "Betz",  "Shawel",  "Gynni",  "Philimore",  "Scoyne",  "Kiffe",  "Ainscow",  "Rosberg",  "Sharples",  "Rudge",  "Gudeman",  "Rowlinson",  "MacCarrane",  "Nardi",  "Bradane",  "Gumn",  "Spinnace",  "Gaiter",  "Pirkis",  "Spinige",  "Boshers",  "Cockarill",  "Renshaw",  "Jamrowicz",  "Hentze",  "Bodle",  "Dudderidge",  "Docherty",  "Northcote",  "Isoldi",  "Wollrauch",  "Maren",  "Uman",  "Cinderey",  "Kliemann",  "Mattiassi",  "Showering",  "Lunck",  "Portugal",  "Blaszczak",  "Dadge",  "Connar",  "MacGlory",  "Boecke",  "Victor",  "Kinneir",  "De Witt",  "Aizik",  "Trigwell",  "Keighly",  "De Winton",  "Keavy",  "Shrimpton",  "Bowmaker",  "Schimann",  "Willmer",  "Attrill",  "Sifflett",  "Roaf",  "Furmenger",  "Antao",  "Melby",  "Impy",  "Sennett",  "Duly",  "Galle",  "Fayerman",  "Fossitt",  "Wegener",  "Petherick",  "Stonelake",  "Mathwin",  "Sturch",  "Labrom",  "Neem",  "Beavers",  "Lebbon",  "Carr",  "Blune",  "Pawfoot",  "Djurkovic",  "Hawk",  "Bonnaire",  "Deakin",  "Fritche",  "Rentalll",  "Jenkerson",  "Megroff",  "Lapenna",  "Evenden",  "Marmon",  "Durban",  "Grelka",  "Murrow",  "Seydlitz",  "Blincow",  "Haulkham",  "Bracknall",  "Ivett",  "Jakel",  "Sibille",  "Pepon",  "Matisse",  "Perring",  "McClancy",  "Badland",  "Florey",  "Severs",  "Pugsley",  "Giacovazzo",  "Tomkin",  "Imrie",  "Ferrini",  "Caldairou",  "Di Biagio",  "Sherlock",  "Yankov",  "Livezey",  "Westhofer",  "Bispo",  "Durrance",  "Dick",  "Lawther",  "Sarchwell",  "Catonne",  "Skeene",  "Pounder",  "Pressdee",  "Olivetti",  "Tinline",  "Stanyan",  "Conti",  "Rolph",  "Skeath",  "Boxe",  "Spurrier",  "Gidman",  "Kikke",  "Breslau",  "Spurrett",  "Schimek",  "Digges",  "Cammacke",  "Scroyton",  "Denslow",  "Charnick",  "Lopes",  "Dumini",  "Joiris",  "Bockman",  "Fraczek",  "Skivington",  "Boosey",  "Cowderay",  "Simenot",  "Chaytor",  "Berrie",  "Cookley",  "Graalmans",  "Yuryaev",  "Delacourt",
                "Jelleman",  "McQuie",  "Jaskiewicz",  "Scholes",  "Ramsey",  "Hakonsson",  "Noury",  "Usmar",  "Santhouse",  "Dils",  "Manilo",  "Pasticznyk",  "Breed",  "Holhouse",  "Ghione",  "Rumin",  "Fassman",  "Van Hault",  "Lynnett",  "Muttock",  "Poultney",  "Dodswell",  "Duckitt",  "Musgrave",  "Phillipson",  "Krollmann",  "Hughf",  "Duffit",  "Malthouse",  "Dabell",  "Puleston",  "McClements",  "Hencke",  "Revett",  "Szymoni",  "Ewbanche",  "Erik",  "Sothern",  "Larrad",  "Jewis",  "Dubble",  "Clampton",  "Maliffe",  "Paley",  "Sidaway",  "Likely",  "Kempson",  "Beavon",  "Cowing",  "Whitefoot",  "Simoni",  "Truse",  "Stuchburie",  "Armour",  "Slewcock",  "Gallie",  "Lang",  "Gwinnel",  "Doidge",  "Wilcockes",  "Wakerley",  "Dutton",  "Leney",  "Element",  "Matches",  "Rosina",  "Pittford",  "Piggford",  "Ringe",  "Howse",  "Choules",  "Duckinfield",  "Heinzler",  "Rolston",  "Kiffe",  "Mackinder",  "Cisar",  "Reece",  "Headrick",  "Fancott",  "Castagna",  "Dolman",  "Lisle",  "Dakin",  "Edmonson",  "Fawltey",  "Riddles",  "Scourgie",  "Ellson",  "Hoggin",  "Thomlinson",  "Rowland",  "Ramstead",  "Andrewartha",  "Bardill",  "Stegers",  "Dellar",  "Rhys",  "Grills",  "Murfill",  "Biffin",  "Courteney",  "Heersema",  "Holyard",  "Osboldstone",  "Overall",  "MacTrustey",  "Corradini",  "Bellsham",  "Tytler",  "Caldecott",  "Bradshaw",  "Diggle",  "Rogerot",  "Sandland",  "Edson",  "Elsop",  "Booker",  "Blabber",  "Spink",  "Ansell",  "Molson",  "Littleton",  "Horsefield",  "Lorek",  "Lawland",  "Tregona",  "Meiklejohn",  "Ritchie",  "MacNeish",  "Antrim",  "Salery",  "Bramah",  "Coppen",  "Adamo",  "Vardey",  "Stockney",  "Denkel",  "Faltskog",  "Mayler",  "Boribal",  "Attrill",  "Evennett",  "Hazelden",  "McGowing",  "Chadburn",  "Coase",  "Shippard",  "Sandiford",  "Snowsill",  "Balden",  "Lidgertwood",  "VanBrugh"};
        List<String> listLastNames = new ArrayList<>(Arrays.asList(tabLastNames));
        String [] tabStreets = {"Magnolia Avenue","JFK Street","West Street", "Amsterdam Avenue","East Side","5th Avenue", "Baker Road"};
        List <String> listStreets = new ArrayList<>(Arrays.asList(tabStreets));

        String [] tabCities = {"Boston", "Los Angeles", "Oklahoma City", "Washington", "Miami", "Denver", "San Jose", "Atlanta",
                "Seatle","Cansas City","Dover","Chicago","Detroit","San Antonio", "Charleston"};
        List <String> listCities = new ArrayList<>(Arrays.asList(tabCities));
        String [] tabCompanies = {"First Trust RBA Quality Income ETF",  "KBR, Inc.",  "Golar LNG Limited",  "Cerecor Inc.",  "HSBC Holdings plc",  "J P Morgan Chase & Co",  "Cincinnati Bell Inc",  "Blueknight Energy Partners L.P., L.L.C.",  "Natl Westminster Pfd",  "Gilead Sciences, Inc.",  "First United Corporation",  "BWX Technologies, Inc.",  "Fluor Corporation",  "GTx, Inc.",  "Cass Information Systems, Inc",  "Vicor Corporation",  "Nano Dimension Ltd.",  "Cohen & Steers Limited Duration Preferred and Income Fund, Inc",  "ClearSign Combustion Corporation",  "ProPetro Holding Corp.",  "E.I. du Pont de Nemours and Company",  "General Motors Company",  "VictoryShares US EQ Income Enhanced Volatility Wtd ETF",  "Goldman Sachs Group, Inc. (The)",  "Nuveen Ohio Quality Municipal Income Fund",  "Everi Holdings Inc.",  "Seres Therapeutics, Inc.",  "Booz Allen Hamilton Holding Corporation",  "Cobalt International Energy, Inc.",  "Almost Family Inc",  "Vanguard International High Dividend Yield ETF",  "First Hawaiian, Inc.",  "ClearBridge Energy MLP Fund Inc.",  "RealNetworks, Inc.",  "Rayonier Inc.",  "China Cord Blood Corporation",  "Pennsylvania Real Estate Investment Trust",  "Saratoga Investment Corp",  "Safe Bulkers, Inc",  "UNIVERSAL INSURANCE HOLDINGS INC",  "Pulse Biosciences, Inc",  "Liberty Media Corporation",  "Teekay LNG Partners L.P.",  "SandRidge Energy, Inc.",  "iShares MSCI Europe Financials Sector Index Fund",  "Trillium Therapeutics Inc.",  "Restaurant Brands International Inc.",  "StealthGas, Inc.",  "LaSalle Hotel Properties",  "Nuveen Tax-Advantaged Total Return Strategy Fund",  "Seabridge Gold, Inc.",  "Open Text Corporation",  "Wells Fargo & Company",  "Esperion Therapeutics, Inc.",  "Voya Global Advantage and Premium Opportunity Fund",  "NCS Multistage Holdings, Inc.",  "Red Lion Hotels Corporation",  "DLH Holdings Corp.",  "Hercules Capital, Inc.",  "First Trust Emerging Markets Small Cap AlphaDEX Fund",  "Yingli Green Energy Holding Company Limited",  "Wheeler Real Estate Investment Trust, Inc.",  "Five Below, Inc.",  "Iron Mountain Incorporated",  "Great Plains Energy Inc",  "BlackRock Income Trust Inc. (The)",  "Ascent Capital Group, Inc.",  "Calamos Global Total Return Fund",  "Ramco-Gershenson Properties Trust",  "Total S.A.",  "VALE S.A.",  "Rosetta Genomics Ltd.",  "Second Sight Medical Products, Inc.",  "Aberdeen Greater China Fund, Inc.",  "Buffalo Wild Wings, Inc.",  "U.S. Bancorp",  "MFS Special Value Trust",  "VictoryShares Emerging Market Volatility Wtd ETF",  "Edge Therapeutics, Inc.",  "Eastman Chemical Company",  "Lantheus Holdings, Inc.",  "Toll Brothers Inc.",  "XG Technology, Inc",  "Quest Resource Holding Corporation.",  "PartnerRe Ltd.",  "Neovasc Inc.",  "Legg Mason, Inc.",  "Lilis Energy, Inc.",  "Washington Federal, Inc.",  "Five Oaks Investment Corp.",  "JELD-WEN Holding, Inc.",  "Christopher & Banks Corporation",  "Meridian Waste Solutions, Inc",  "Global X FinTech ETF",  "Severn Bancorp Inc",  "NETGEAR, Inc.",  "Loxo Oncology, Inc.",  "LM Funding America, Inc.",  "Pacific Special Acquisition Corp.",  "Accuray Incorporated",  "Bunge Limited",  "Cemtrex Inc.",  "W.R. Berkley Corporation",  "Marten Transport, Ltd.",  "The First Bancshares, Inc.",  "Phibro Animal Health Corporation",  "Ryanair Holdings plc",  "Sussex Bancorp",  "Aware, Inc.",  "Discover Financial Services",  "Integra LifeSciences Holdings Corporation",  "MarketAxess Holdings, Inc.",  "Royal Bank Scotland plc (The)",  "ZAGG Inc",  "Cigna Corporation",  "Cesca Therapeutics Inc.",  "Bank of Hawaii Corporation",  "Arlington Asset Investment Corp",  "Berkshire Hathaway Inc.",  "Eldorado Resorts, Inc.",  "Energizer Holdings, Inc.",  "Barclays Inverse US Treasury Composite ETN",  "Sage Therapeutics, Inc.",  "Mercury General Corporation",  "NF Energy Saving Corporation",  "Invacare Corporation",  "B. Riley Financial, Inc.",  "Guaranty Federal Bancshares, Inc.",  "Equity Bancshares, Inc.",  "CBS Corporation",  "Ross Stores, Inc.",  "Lawson Products, Inc.",  "Terreno Realty Corporation",  "Endologix, Inc.",  "PIMCO California Municipal Income Fund",  "Monster Digital, Inc.",  "Computer Programs and Systems, Inc.",  "Nuveen Senior Income Fund",  "Choice Hotels International, Inc.",  "First Community Corporation",  "Hecla Mining Company",  "AtriCure, Inc.",  "VanEck Vectors Pharmaceutical ETF",  "Genie Energy Ltd.",  "Old Second Bancorp, Inc.",  "Grifols, S.A.",  "AAON, Inc.",
                "PC-Tel, Inc.",  "China Petroleum & Chemical Corporation",  "NextEra Energy, Inc.",  "First Trust Senior Loan Fund ETF",  "Aspen Insurance Holdings Limited",  "Proto Labs, Inc.",  "iPath US Treasury Long Bond Bull ETN",  "Chemung Financial Corp",  "Otelco Inc.",  "Merrill Lynch Depositor, Inc.",  "John Wiley & Sons, Inc.",  "ZAIS Group Holdings, Inc.",  "Whiting Petroleum Corporation",  "HealthSouth Corporation",  "NI Holdings, Inc.",  "Cavco Industries, Inc.",  "SK Telecom Co., Ltd.",  "Kennedy-Wilson Holdings Inc.",  "Protagonist Therapeutics, Inc.",  "State Bank Financial Corporation.",  "Kroger Company (The)",  "Horizon Global Corporation",  "RiverNorth Opportunities Fund, Inc.",  "Nortel Inversora SA",  "IQ Chaikin U.S. Small Cap ETF",  "ServiceSource International, Inc.",  "MACOM Technology Solutions Holdings, Inc.",  "Eaton Vance Risk-Managed Diversified Equity Income Fund",  "Yext, Inc.",  "Envision Healthcare Corporation",  "Acxiom Corporation",  "EXFO Inc",  "Federated National Holding Company",  "Manitowoc Company, Inc. (The)",  "Entertainment Gaming Asia Incorporated",  "Gabelli Equity Trust, Inc. (The)",  "Twenty-First Century Fox, Inc.",  "Amtech Systems, Inc.",  "bebe stores, inc.",  "Atlas Air Worldwide Holdings",  "Beazer Homes USA, Inc.",  "Deutsche Bank AG",  "Pacific Ethanol, Inc.",  "Nordic American Offshore Ltd",  "Highwoods Properties, Inc.",  "Oncobiologics, Inc.",  "UNIVERSAL INSURANCE HOLDINGS INC",  "Prosperity Bancshares, Inc.",  "Keryx Biopharmaceuticals, Inc.",  "SunTrust Banks, Inc.",  "BlackRock Investment Quality Municipal Trust Inc. (The)",  "Entergy Louisiana, Inc.",  "PowerShares Global Agriculture Portfolio",  "NV5 Global, Inc.",  "Innocoll Holdings",  "EMCORE Corporation",  "Seabridge Gold, Inc.",  "CBOE Holdings, Inc.",  "PNC Financial Services Group, Inc. (The)",  "Concord Medical Services Holdings Limited",  "Mitsubishi UFJ Financial Group Inc",  "National Holdings Corporation",  "Bemis Company, Inc.",  "PartnerRe Ltd.",  "Sears Canada Inc. ",  "Panhandle Royalty Company",  "Tejon Ranch Co",  "Soligenix, Inc.",  "Synovus Financial Corp.",  "Merus N.V.",  "Murphy USA Inc.",  "Terex Corporation",  "P.A.M. Transportation Services, Inc.",  "Warrior Met Coal, Inc.",  "First Trust Rising Dividend Achievers ETF",  "Nuveen California Municipal Value Fund 2",  "Pope Resources",  "Rightside Group, Ltd.",  "Mack-Cali Realty Corporation",  "The Gabelli Healthcare & Wellness Trust",  "FIRST REPUBLIC BANK",  "Grupo Financiero Galicia S.A.",  "AmTrust Financial Services, Inc.",  "BlackRock Capital Investment Corporation",  "PartnerRe Ltd.",  "Avinger, Inc.",  "Petrobras Argentina S.A.",  "Sterling Bancorp",  "FuelCell Energy, Inc.",  "iShares MSCI EM ESG Optimized ETF",  "Synthetic Fixed-Income Securities, Inc.",  "PowerShares DWA Energy Momentum Portfolio",  "Fortress Investment Group LLC",  "Golden Entertainment, Inc.",  "Gridsum Holding Inc.",  "Kinder Morgan, Inc.",  "Lincoln National Corporation",  "Edge Therapeutics, Inc.",  "Avista Healthcare Public Acquisition Corp.",  "Okta, Inc.",  "First Trust United Kingdom AlphaDEX Fund",  "ClearBridge Large Cap Growth ESG ETF",  "Och-Ziff Capital Management Group LLC",  "Invesco Plc",  "Randolph Bancorp, Inc.",  "Primerica, Inc.",  "Parke Bancorp, Inc.",  "Jack Henry & Associates, Inc.",  "Apache Corporation",  "Scorpio Bulkers Inc.",  "Regeneron Pharmaceuticals, Inc.",  "Bellicum Pharmaceuticals, Inc.",  "Westlake Chemical Corporation",  "Glu Mobile Inc.",  "Olin Corporation",  "Saia, Inc.",  "Banco Bradesco Sa",  "SecureWorks Corp.",  "AmTrust Financial Services, Inc.",  "Dime Community Bancshares, Inc.",  "Calamos Strategic Total Return Fund",  "Canadian Natural Resources Limited",  "Neenah Paper, Inc.",  "Protective Life Corporation",  "City Office REIT, Inc.",  "Bemis Company, Inc.",  "Dominion Energy, Inc.",  "Urstadt Biddle Properties Inc.",  "Blackrock MuniYield Quality Fund III, Inc.",  "Ardmore Shipping Corporation",  "TOR Minerals International Inc",  "Lennar Corporation",  "TopBuild Corp.",  "Denbury Resources Inc.",  "McDonald&#39;s Corporation",  "Kingstone Companies, Inc",  "Vident Core U.S. Bond Strategy Fund",  "Flaherty & Crumrine Total Return Fund Inc",  "Brooks Automation, Inc.",  "NuStar Logistics, L.P.",  "Five Prime Therapeutics, Inc.",  "Barings Corporate Investors",  "Texas Capital Bancshares, Inc.",  "e.l.f. Beauty, Inc.",  "KalVista Pharmaceuticals, Inc.",  "Cinemark Holdings Inc",  "Nuveen New York Municipal Value Fund 2",  "BHP Billiton Limited",  "YuMe, Inc.",  "TEGNA Inc.",  "M&T Bank Corporation",  "Barclays PLC",  "XBiotech Inc.",  "Celgene Corporation",  "NGL ENERGY PARTNERS LP",  "Natural Resource Partners LP",  "Dunkin&#39; Brands Group, Inc.",  "Matador Resources Company",  "Sprouts Farmers Market, Inc.",
                "Cambrex Corporation",  "Wheeler Real Estate Investment Trust, Inc.",  "BioLineRx Ltd.",  "CNH Industrial N.V.",  "MCBC Holdings, Inc.",  "MGM Growth Properties LLC",  "MacroGenics, Inc.",  "Scientific Games Corp",  "Quinpario Acquisition Corp. 2",  "Adams Diversified Equity Fund, Inc.",  "First Trust NASDAQ-100 Equal Weighted Index Fund",  "Southern Copper Corporation",  "Credit Suisse AG",  "E*TRADE Financial Corporation",  "Sonic Foundry, Inc.",  "Matlin & Partners Acquisition Corporation",  "Hess Corporation",  "Energy Focus, Inc.",  "Benefitfocus, Inc.",  "Gap, Inc. (The)",  "Primo Water Corporation",  "Landmark Infrastructure Partners LP",  "DHX Media Ltd.",  "Advaxis, Inc.",  "NeuroDerm Ltd.",  "Neonode Inc.",  "CBOE Holdings, Inc.",  "Stanley Black & Decker, Inc.",  "SPX FLOW, Inc.",  "Voya Emerging Markets High Income Dividend Equity Fund",  "Prudential Financial, Inc.",  "Customers Bancorp, Inc",  "Wells Fargo & Company",  "United Bancshares, Inc.",  "National Research Corporation",  "MidSouth Bancorp",  "Pebblebrook Hotel Trust",  "Connecticut Water Service, Inc.",  "Honda Motor Company, Ltd.",  "InnerWorkings, Inc.",  "Alpha and Omega Semiconductor Limited",  "BlackRock Resources",  "X-Links Gold Shares Covered Call ETN",  "M.D.C. Holdings, Inc.",  "TPG Specialty Lending, Inc.",  "Emclaire Financial Corp",  "Opko Health, Inc.",  "Protective Life Corporation",  "Bassett Furniture Industries, Incorporated",  "Mesa Laboratories, Inc.",  "Asure Software Inc",  "Tyson Foods, Inc.",  "MannKind Corporation",  "Papa Murphy&#39;s Holdings, Inc.",  "Hersha Hospitality Trust",  "Intersections, Inc.",  "Xenon Pharmaceuticals Inc.",  "Jack Henry & Associates, Inc.",  "Ameris Bancorp",  "Biolase, Inc.",  "Infinity Pharmaceuticals, Inc.",  "Fulgent Genetics, Inc.",  "FibroGen, Inc",  "XBiotech Inc.",  "Pimco New York Municipal Income Fund II",  "Bank Of New York Mellon Corporation (The)",  "UMB Financial Corporation",  "Alphabet Inc.",  "Zix Corporation",  "OUTFRONT Media Inc.",  "Moxian, Inc.",  "Jewett-Cameron Trading Company",  "Ohr Pharmaceuticals, Inc.",  "Brooks Automation, Inc.",  "Adamis Pharmaceuticals Corporation",  "BlackRock New York Investment Quality Municipal Trust Inc. (Th",  "MFA Financial, Inc.",  "Arena Pharmaceuticals, Inc.",  "Capital City Bank Group",  "Iridium Communications Inc",  "Forum Merger Corporation",  "Eaton Vance NextShares Trust",  "W.R. Berkley Corporation",  "Accenture plc",  "Forward Pharma A/S",  "Dime Community Bancshares, Inc.",  "Daseke, Inc.",  "Steel Partners Holdings LP",  "MercadoLibre, Inc.",  "Zayo Group Holdings, Inc.",  "Pzena Investment Management Inc",  "Axon Enterprise, Inc.",  "Expeditors International of Washington, Inc.",  "Papa Murphy&#39;s Holdings, Inc.",  "Occidental Petroleum Corporation",  "Celgene Corporation",  "United Community Banks, Inc.",  "NGL ENERGY PARTNERS LP",  "Changyou.com Limited",  "Teledyne Technologies Incorporated",  "Tesla, Inc. ",  "Statoil ASA",  "PowerShares DWA Basic Materials Momentum Portfolio",  "Landmark Bancorp Inc.",  "LSC Communications, Inc.",  "CenterPoint Energy, Inc.",  "Avista Healthcare Public Acquisition Corp.",  "Verint Systems Inc.",  "DTE Energy Company",  "First Defiance Financial Corp.",  "Liberty Tax, Inc.",  "Esperion Therapeutics, Inc.",  "Liberty Broadband Corporation",  "Computer Task Group, Incorporated",  "Willbros Group, Inc.",  "Medley Capital Corporation",  "Eleven Biotherapeutics, Inc.",  "DDR Corp.",  "The GDL Fund",  "Neurotrope, Inc.",  "AMC Networks Inc.",  "Echo Global Logistics, Inc.",  "Lake Shore Bancorp, Inc.",  "The Travelers Companies, Inc.",  "Mimecast Limited",  "Global Partner Acquisition Corp.",  "FinTech Acquisition Corp. II",  "Nuveen AMT-Free Municipal Credit Income Fund",  "NxStage Medical, Inc.",  "American Financial Group, Inc.",  "MSG Networks Inc.",  "Asure Software Inc",  "PNM Resources, Inc. (Holding Co.)",  "Gap, Inc. (The)",  "Spark Therapeutics, Inc.",  "MSA Safety Incorporporated",  "Scudder Global High Income Fund, Inc.",  "Gabelli Dividend",  "Molson Coors Brewing  Company",  "Ross Stores, Inc.",  "The Hain Celestial Group, Inc.",  "Centene Corporation",  "Zynga Inc.",  "Accenture plc",  "Federated National Holding Company",  "Woodward, Inc.",  "GoPro, Inc.",  "Arbor Realty Trust",  "Korea Equity Fund, Inc.",  "Zions Bancorporation",  "MyoKardia, Inc.",  "American River Bankshares",  "Loews Corporation",  "Dynex Capital, Inc.",  "Fidelity Nasdaq Composite Index Tracking Stock",  "Alaska Communications Systems Group, Inc.",  "Monro Muffler Brake, Inc.",  "Willis Towers Watson Public Limited Company",  "CBL & Associates Properties, Inc.",  "iShares PHLX SOX Semiconductor Sector Index Fund",  "Sun Bancorp, Inc.",  "Northern Trust Corporation",  "iPath US Treasury Steepener ETN",  "Varian Medical Systems, Inc.",  "Trimble Inc.",  "P.A.M. Transportation Services, Inc.",  "Acadia Realty Trust",  "KBL Merger Corp. IV",  "BlackRock, Inc.",  "Gladstone Commercial Corporation",  "Wells Fargo & Company",  "H&E Equipment Services, Inc.",  "Donegal Group, Inc.",  "Donaldson Company, Inc.",  "Harmony Gold Mining Company Limited",  "First Community Corporation",  "Telecom Italia S.P.A.",
                "VelocityShares VIX Short-Term ETN",  "Eaton Vance High Income 2021 Target Term Trust",  "Triple-S Management Corporation",  "Forward Industries, Inc.",  "Wellesley Bancorp, Inc.",  "Rice Midstream Partners LP",  "L Brands, Inc.",  "RiceBran Technologies",  "NI Holdings, Inc.",  "AT&T Inc.",  "Foresight Energy LP",  "Southern Company (The)",  "Ingredion Incorporated",  "Saul Centers, Inc.",  "Vail Resorts, Inc.",  "Monotype Imaging Holdings Inc.",  "Morgan Stanley",  "Janus Henderson Group plc",  "Herc Holdings Inc.",  "Signature Bank",  "Carbo Ceramics, Inc.",  "OFG Bancorp",  "Telefonica SA",  "Arrow Financial Corporation",  "Diageo plc",  "BioTelemetry, Inc.",  "Coty Inc.",  "First Trust Managed Municipal ETF",  "Select Bancorp, Inc.",  "Freshpet, Inc.",  "RLJ Entertainment, Inc.",  "Dreyfus Strategic Municipals, Inc.",  "Northrop Grumman Corporation",  "VanEck Vectors Generic Drugs ETF",  "TOR Minerals International Inc",
                "Zynerba Pharmaceuticals, Inc.",  "Pilgrim Pride Corporation",  "ReWalk Robotics Ltd",  "Home Bancorp, Inc.",  "PNC Financial Services Group, Inc. (The)",  "Chesapeake Utilities Corporation",  "Commercial Vehicle Group, Inc.",  "Regions Financial Corporation",  "Energy Transfer Partners, L.P.",  "Comstock Holding Companies, Inc.",  "Hawaiian Holdings, Inc.",  "Apple Inc.",  "ManTech International Corporation",  "Kindred Healthcare, Inc.",  "Waters Corporation",  "Tableau Software, Inc.",  "Citrix Systems, Inc.",  "ORBCOMM Inc.",  "Zix Corporation",  "Aralez Pharmaceuticals Inc.",  "General Dynamics Corporation",  "Arcos Dorados Holdings Inc.",  "Highwoods Properties, Inc.",  "RiceBran Technologies",  "Crown Crafts, Inc.",  "Tyler Technologies, Inc.",  "Altria Group",  "Ecolab Inc.",  "Patriot National, Inc.",  "OpGen, Inc.",  "Dorian LPG Ltd.",  "Rosehill Resources Inc.",  "Royce Global Value Trust, Inc.",  "TRI Pointe Group, Inc.",  "FTD Companies, Inc.",  "Nuveen Preferred and Income Term Fund",  "WisdomTree Barclays Interest Rate Hedged U.S. Aggregate Bond F",  "VOC Energy Trust",  "Goldman Sachs Group, Inc. (The)",  "SiteOne Landscape Supply, Inc.",  "Harvest Capital Credit Corporation",  "Delphi Automotive plc",  "Tenneco Inc.",  "Ringcentral, Inc.",  "Galmed Pharmaceuticals Ltd.",  "Ultrapar Participacoes S.A.",  "CNH Industrial N.V.",  "Lazard Ltd.",  "Goldman Sachs Group, Inc. (The)",  "HollyFrontier Corporation",  "Alexandria Real Estate Equities, Inc.",  "IDACORP, Inc.",  "Dollar General Corporation",  "Cathay General Bancorp",  "Sophiris Bio, Inc.",  "FairPoint Communications, Inc.",  "Eleven Biotherapeutics, Inc.",  "Astoria Financial Corporation",  "T-Mobile US, Inc.",  "IBERIABANK Corporation",  "Eaton Vance Corporation",  "MKS Instruments, Inc.",  "Nuveen All Cap Energy MLP Opportunities Fund",  "Ashford Hospitality Trust Inc",  "Eros International PLC",  "Oaktree Capital Group, LLC",  "Access National Corporation",  "Blackstone GSO Senior Floating Rate Term Fund",  "Kirkland&#39;s, Inc.",  "Colony NorthStar, Inc.",  "MRC Global Inc.",  "Idera Pharmaceuticals, Inc.",  "InfoSonics Corp",  "Southwestern Energy Company",  "Nova Measuring Instruments Ltd.",  "Synthesis Energy Systems, Inc.",  "Brown & Brown, Inc.",  "Alphatec Holdings, Inc.",  "Del Taco Restaurants, Inc.",  "Seaspan Corporation",  "Nova Lifestyle, Inc",  "Community Bankers Trust Corporation.",  "Whitestone REIT",  "Sun Communities, Inc.",  "America Movil, S.A.B. de C.V.",  "Murphy Oil Corporation",  "First Financial Bankshares, Inc.",  "ZAIS Group Holdings, Inc.",  "BT Group plc",  "Superior Uniform Group, Inc.",  "1st Source Corporation",  "iShares 20+ Year Treasury Bond ETF",  "Manchester United Ltd.",  "Town Sports International Holdings, Inc.",  "Eiger BioPharmaceuticals, Inc.",  "TE Connectivity Ltd.",  "Ingredion Incorporated",  "Chimerix, Inc.",  "Bemis Company, Inc.",  "Neos Therapeutics, Inc.",  "Abercrombie & Fitch Company",  "Brookdale Senior Living Inc.",  "Credicorp Ltd.",  "TE Connectivity Ltd.",  "Danaos Corporation",  "Blackrock Muni Intermediate Duration Fund Inc",  "Brandywine Realty Trust",  "JMP Group LLC",  "Ecology and Environment, Inc.",  "Tabula Rasa HealthCare, Inc.",  "Eaton Vance NextShares Trust",  "Bank of America Corporation",  "MEI Pharma, Inc.",  "Adobe Systems Incorporated",  "Flowserve Corporation",  "Telefonica SA",  "Spring Bank Pharmaceuticals, Inc.",  "Telephone and Data Systems, Inc.",  "Camping World Holdings, Inc.",  "McDermott International, Inc.",  "Magal Security Systems Ltd.",  "Fairmount Santrol Holdings Inc.",  "Mednax, Inc",  "Apptio, Inc.",  "Marcus Corporation (The)",  "VictoryShares International High Div Volatility Wtd ETF",  "Pain Therapeutics, Inc.",  "Arc Logistic Partners LP",  "Fastenal Company",  "Ambac Financial Group, Inc.",  "Ally Financial Inc.",  "PAR Technology Corporation",  "Enduro Royalty Trust",  "TPG Pace Energy Holdings Corp.",  "Abeona Therapeutics Inc.",  "Eleven Biotherapeutics, Inc.",  "Calamos Convertible and High Income Fund",  "Pitney Bowes Inc.",  "GigaMedia Limited",  "Rand Capital Corporation",  "Mesa Laboratories, Inc.",  "Balchem Corporation",  "Shenandoah Telecommunications Co",  "Mercury General Corporation",  "Meritage Corporation",  "Resolute Forest Products Inc.",  "Capital One Financial Corporation",  "Guess?, Inc.",  "TriMas Corporation",  "Consolidated Edison Inc",  "Public Storage",  "Broadway Financial Corporation",  "FirstService Corporation",  "Kindred Biosciences, Inc.",  "PIMCO Commercial Mortgage Securities Trust, Inc.",  "Veeva Systems Inc.",  "Brookdale Senior Living Inc.",  "World Point Terminals, LP",  "Crocs, Inc.",  "Federal Agricultural Mortgage Corporation",  "China Lodging Group, Limited",  "Dynagas LNG Partners LP",  "PowerShares S&P SmallCap Utilities Portfolio",  "Landmark Infrastructure Partners LP",  "Ascent Capital Group, Inc.",  "Kinder Morgan, Inc.",  "Valmont Industries, Inc.",  "United States Cellular Corporation",  "JMP Group LLC",  "Horizon Technology Finance Corporation",  "Xperi Corporation",  "Playa Hotels & Resorts N.V.",  "Telephone and Data Systems, Inc.",  "Simulations Plus, Inc.",  "Cytokinetics",
               "Incorporated",  "New York REIT, Inc.",  "ENGlobal Corporation",  "Colgate-Palmolive Company",  "VASCO Data Security International, Inc.",  "Solar Capital Ltd.",  "PTC Therapeutics, Inc.",  "Zendesk, Inc.",  "Boise Cascade, L.L.C.",  "Oxbridge Re Holdings Limited",  "NASDAQ TEST STOCK",  "Transdigm Group Incorporated",  "Sanofi",  "Broadcom Limited",  "OncoGenex Pharmaceuticals Inc.",  "Versum Materials, Inc.",  "Daseke, Inc.",  "Magyar Bancorp, Inc.",  "CPFL Energia S.A.",  "CBS Corporation",  "Comcast Corporation",  "UNITIL Corporation",  "Carolina Trust BancShares, Inc.",  "Cardiovascular Systems, Inc.",  "Dime Community Bancshares, Inc.",  "BCE, Inc.",  "NetSol Technologies Inc.",  "Scorpio Tankers Inc.",  "Deluxe Corporation",  "The GDL Fund",  "Great Plains Energy Inc",  "First Trust High Yield Long/Short ETF",  "Ivy NextShares",  "First Financial Bankshares, Inc.",  "Physicians Realty Trust",  "The Hanover Insurance Group, Inc.",  "Rayonier Advanced Materials Inc.",  "VelocityShares Daily 2x VIX Medium-Term ETN",  "Cimpress N.V",  "Golden Ocean Group Limited",  "Cara Therapeutics, Inc.",  "FS Bancorp, Inc.",  "Heritage Insurance Holdings, Inc.",  "FARO Technologies, Inc.",  "Advantage Oil & Gas Ltd",  "Global X Health & Wellness Thematic ETF",  "The Health and Fitness ETF",  "Xcel Brands, Inc",  "Westpac Banking Corporation",  "The Charles Schwab Corporation",  "CM Finance Inc",  "BB&T Corporation",  "Farmers National Banc Corp.",  "Grupo Aeroportuario del Centro Norte S.A.B. de C.V.",  "Managed Duration Investment Grade Municipal Fund",  "Silgan Holdings Inc.",  "Urban Edge Properties",  "Aberdeen Japan Equity Fund, Inc. ",  "Remark Holdings, Inc.",  "Cabot Oil & Gas Corporation",  "IRIDEX Corporation",  "Hennessy Advisors, Inc.",  "FuelCell Energy, Inc.",  "First Internet Bancorp",  "NanoString Technologies, Inc.",  "Goldman Sachs Group, Inc. (The)",  "Clifton Bancorp Inc.",  "Redhill Biopharma Ltd.",  "Seneca Foods Corp.",  "WisdomTree Emerging Markets Quality Dividend Growth Fund",  "PowerShares DWA Tactical Multi-Asset Income Portfolio",  "Entergy Texas Inc",  "Atossa Genetics Inc.",  "Capital One Financial Corporation",  "NewLink Genetics Corporation",  "P & F Industries, Inc.",  "Boulevard Acquisition Corp. II",  "Walgreens Boots Alliance, Inc.",  "Yulong Eco-Materials Limited",  "Euronav NV",  "Celestica, Inc.",  "Unity Bancorp, Inc.",  "Ventas, Inc.",
        "SeaChange International, Inc.",  "SM Energy Company",  "Barclays Inverse US Treasury Composite ETN",  "Waste Connections, Inc.",  "JetBlue Airways Corporation",  "Tidewater Inc.",  "Estee Lauder Companies, Inc. (The)",  "Alexandria Real Estate Equities, Inc.",  "Enterprise Bancorp Inc",  "PowerShares Russell 1000 Low Beta Equal Weight Portfolio",  "OraSure Technologies, Inc.",  "iShares iBoxx $ High Yield ex Oil & Gas Corporate Bond ETF",  "Fitbit, Inc.",  "First Business Financial Services, Inc.",  "Kratos Defense & Security Solutions, Inc.",  "Envestnet, Inc",  "RAIT Financial Trust",  "NOW Inc.",  "Tesoro Logistics LP",  "Entergy Arkansas, Inc.",  "ZIOPHARM Oncology Inc",  "The Hanover Insurance Group, Inc.",  "Jabil Inc.",  "Avangrid, Inc.",  "PFSweb, Inc.",  "Orion Energy Systems, Inc.",  "Liberty Media Corporation",  "SORL Auto Parts, Inc.",  "THL Credit, Inc.",  "J. Alexander&#39;s Holdings, Inc.",  "Qualstar Corporation",  "Silicon Laboratories, Inc.",  "RadNet, Inc.",  "Asta Funding, Inc.",  "BalckRock Taxable Municipal Bond Trust",  "Cato Corporation (The)",  "American Homes 4 Rent",  "Legg Mason, Inc.",  "ScanSource, Inc.",  "Streamline Health Solutions, Inc.",  "Virtusa Corporation",  "CBIZ, Inc.",  "OMNOVA Solutions Inc.",  "Kingsway Financial Services, Inc.",  "OFG Bancorp",  "Sears Canada Inc. ",  "TerraForm Power, Inc.",  "Bank Of New York Mellon Corporation (The)",  "Model N, Inc.",  "Applied Genetic Technologies Corporation",  "Ruby Tuesday, Inc.",  "Equity Commonwealth",  "Hewlett Packard Enterprise Company",  "Nomura Holdings Inc ADR",  "Dynegy Inc.",  "MarketAxess Holdings, Inc.",  "MFC Bancorp Ltd.",  "Cancer Genetics, Inc.",  "NextEra Energy, Inc.",  "VelocityShares Daily Inverse VIX Short-Term ETN",  "Natus Medical Incorporated",  "Sensient Technologies Corporation",  "MDU Resources Group, Inc.",  "FIRST REPUBLIC BANK",  "Home Federal Bancorp, Inc. of Louisiana",  "BlackLine, Inc.",  "Air Transport Services Group, Inc",  "RPC, Inc.",  "Steel Partners Holdings LP",  "DoubleLine Income Solutions Fund",
                "United Bankshares, Inc.",  "Cliffs Natural Resources Inc.",  "Horizon Technology Finance Corporation",  "iShares FTSE EPRA/NAREIT Europe Index Fund",  "Oxbridge Re Holdings Limited",  "Hannon Armstrong Sustainable Infrastructure Capital, Inc.",  "Eversource Energy",  "Utah Medical Products, Inc.",  "Telefonica SA",  "RLJ Entertainment, Inc.",  "Sunworks, Inc.",  "Marlin Business Services Corp.",  "Yum! Brands, Inc.",  "Cohen & Steers Total Return Realty Fund, Inc.",  "Fate Therapeutics, Inc.",  "Mylan N.V.",  "eBay Inc.",  "Consolidated Communications Holdings, Inc.",  "Portland General Electric Company",  "lululemon athletica inc.",  "Bridge Bancorp, Inc.",  "Impax Laboratories, Inc.",  "Targa Resources Partners LP",  "American Tower Corporation (REIT)",  "Pzena Investment Management Inc",  "BT Group plc",  "HC2 Holdings, Inc.",  "Global Partners LP",  "KMG Chemicals, Inc.",  "Globus Medical, Inc.",  "Assembly Biosciences, Inc.",  "Therapix Biosciences Ltd.",  "Datawatch Corporation",  "Scorpio Tankers Inc.",  "Flexsteel Industries, Inc.",  "Pzena Investment Management Inc",  "Century Communities, Inc.",  "Hanmi Financial Corporation",  "Government Properties Income Trust",  "Unifirst Corporation",  "Glacier Bancorp, Inc.",  "Atrion Corporation",  "Insulet Corporation",  "Goldman Sachs MLP Income Opportunities Fund",  "Monmouth Real Estate Investment Corporation",  "Vantiv, Inc.",  "Cohen & Steers Total Return Realty Fund, Inc.",  "SunTrust Banks, Inc.",  "Southwestern Energy Company",  "Aviat Networks, Inc.",  "MidWestOne Financial Group, Inc.",  "Old Second Bancorp, Inc.",  "Ocwen Financial Corporation",  "Cincinnati Bell Inc",  "Aspen Insurance Holdings Limited",  "Logitech International S.A.",  "MGM Growth Properties LLC",
                "Farmer Brothers Company",  "Kaman Corporation",  "Coty Inc.",  "Modine Manufacturing Company",  "Lions Gate Entertainment Corporation",  "Dycom Industries, Inc.",  "Chembio Diagnostics, Inc.",  "Gabelli Global Small and Mid Cap Value Trust (The)",  "Senior Housing Properties Trust",  "iShares Nasdaq Biotechnology Index Fund",  "Royal Bank Scotland plc (The)",  "Univest Corporation of Pennsylvania",  "Vornado Realty Trust",  "Nuveen New York Municipal Value Fund, Inc.",  "PowerShares DWA Developed Markets Momentum Portfolio",  "General Electric Company",  "Tenneco Inc.",  "Hancock Holding Company",  "Polar Power, Inc.",  "Asia Pacific Wire & Cable Corporation Limited",  "Wipro Limited",  "The Meet Group, Inc.",  "Investors Real Estate Trust",  "Norwood Financial Corp.",  "China Unicom (Hong Kong) Ltd",  "CRA International,Inc.",  "Maximus, Inc.",  "Nuveen Connecticut Quality Municipal Income Fund",  "EnteroMedics Inc.",  "RAIT Financial Trust",  "RAIT Financial Trust",  "ROBO Global Robotics and Automation Index ETF",  "New York Times Company (The)",  "INVESCO MORTGAGE CAPITAL INC",  "Salem Media Group, Inc.",  "PPlus Trust",  "HNI Corporation",  "Flotek Industries, Inc.",  "Bright Horizons Family Solutions Inc.",  "BlackRock New York Investment Quality Municipal Trust Inc. (Th",  "Yield10 Bioscience, Inc.",  "Capital Product Partners L.P.",  "New Ireland Fund, Inc. (The)",  "Magic Software Enterprises Ltd.",  "Invesco Senior Income Trust",  "Thai Fund, Inc. (The)",  "CSRA Inc.",  "CSP Inc.",  "Algonquin Power & Utilities Corp.",  "City Holding Company",  "Blackrock MuniHoldings New Jersey Insured Fund, Inc.",  "Huntsman Corporation",  "EQT GP Holdings, LP",  "Pro-Dex, Inc.",  "Alliance World Dollar Government Fund II",  "Eastman Kodak Company",  "Amec Plc Ord",  "Alliance One International, Inc.",  "DXC Technology Company",  "Live Nation Entertainment, Inc.",  "Kinsale Capital Group, Inc.",  "Sucampo Pharmaceuticals, Inc.",  "Nordic American Tankers Limited",  "Eaton Vance Corporation",  "New Senior Investment Group Inc.",  "Lilis Energy, Inc.",  "Templeton Global Income Fund, Inc.",  "Insignia Systems, Inc.",  "Group 1 Automotive, Inc.",  "Delta Technology Holdings Limited",  "Gladstone Land Corporation",  "HFF, Inc.",  "Columbus McKinnon Corporation",  "Federal Agricultural Mortgage Corporation",  "Francesca&#39;s Holdings Corporation",  "CVR Energy Inc.",  "Aemetis, Inc",  "First Trust Large Cap Core AlphaDEX Fund",  "Ampco-Pittsburgh Corporation",  "Taylor Devices, Inc.",  "PowerShares 1-30 Laddered Treasury Portfolio",  "Oasmia Pharmaceutical AB",  "United Community Bancorp",  "Array BioPharma Inc.",  "Enzo Biochem, Inc.",  "Great Elm Capital Group, Inc. ",  "Digital Turbine, Inc.",  "Liberty Interactive Corporation",  "Valhi, Inc.",  "SI Financial Group, Inc.",  "Biomerica, Inc.",  "Realogy Holdings Corp.",  "Century Casinos, Inc.",  "Rayonier Advanced Materials Inc.",  "United Financial, Inc.",  "CafePress Inc.",  "Federal Realty Investment Trust"
};
        List <String> listCompanyNames = new ArrayList<>(Arrays.asList(tabCompanies));

        List<Company> listCompanies = new ArrayList<>();

        for (int i = 0; i<1000;i++)


        {
            String companyName = listCompanyNames.get(i);
            String  nip = r.createNip();
            String email = r.createCompanyEmail(companyName);
            String phone = r.createPhoneNumber();
            String addres = r.randomString(listStreets) +" " + r.smallNumber();
            String postal = r.createPostalCode();
            String  city = r.randomString (listCities);

            /// IndividualClient klient = new IndividualClient(i+1,firstName,lastName,phone,email,addres,postal,city, "USA");


            listCompanies.add(new Company(i+1,companyName,nip,phone,email,addres,postal,city, "USA"));
           // System.out.println(listCompanies.get(i));
           // outWriter.println(listCompanies.get(i));
        }



        List<IndividualClient> listOfIndividualClients = new ArrayList<>();

        for (int i = 0; i<2000;i++)


        {
            String firstName = r.randomString (listFirstNames);
            String  lastName = r.randomString (listLastNames);
            String email = r.createEmail(firstName,lastName);
            String phone = r.createPhoneNumber();
            String addres = r.randomString(listStreets) +" " + r.smallNumber();
            String postal = r.createPostalCode();
            String  city = r.randomString (listCities);



           listOfIndividualClients.add(new IndividualClient(i+1001,firstName,lastName,phone,email,addres,postal,city, "USA"));
          // System.out.println(listOfIndividualClients.get(i));
          //  outWriter.println(listOfIndividualClients.get(i));
        }


        List<Conference> listConferences = new ArrayList<>();
        List<Price> listPrices = new ArrayList<>();
        List<ConferenceDay> listConferenceDays = new ArrayList<>();
        List<Workshop> listWorkshops = new ArrayList<>();
        List <ConferenceBooking> listConferenceBooking = new ArrayList<>();
        List<ConferenceDayBooking> listConferenceDayBooking = new ArrayList<>();
        List <WorkshopBooking> listWorkshopBooking = new ArrayList<>();
        List <Participant> listParticipant = new ArrayList<>();
        List <Payment> listPayment = new ArrayList<>();
        List<DayReservation> listDayReservation = new ArrayList<>();
        List<WorkshopReservation> listWorkshopReservation = new ArrayList<>();

        int workshopReservationCounter=0;
        int dayReservationCounter = 0;
        int paymentCounter = 0;

        int workshopCounter = 0;
        int priceCounter= 0;
        int conferenceDayCounter= 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateFirstString = "01/01/2015";
        Date iterDate = dateFormat.parse(dateFirstString);
        int k = 0;
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        //while(iterDate.getYear()<2018 && k > 10);
        while(k < 2)   ////TUTAJ ILOSC KONFERENCJI
       {
            Random rand = new Random();
            String language = r.chooseLanduage();
            int conferenceID = k;
            String conferenceName = r.createConferenceName(language);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(iterDate);
            int n = rand.nextInt (15) + 5;
            calendar.add(Calendar.DATE,n);
            iterDate = calendar.getTime();
            String startDate = dateFormat.format(iterDate);




            n = rand.nextInt (99) + 1;
            double studentDiscount = n*1.0/100;
            String city = r.randomString(listCities);
            String postalCode = r.createPostalCode();
            String address = r.randomString(listStreets) +" " + r.smallNumber();
            String email = r.createCompanyEmail(language);

            calendar.setTime(iterDate);
            n = rand.nextInt (4) + 0;
            calendar.add(Calendar.DATE,n);
            iterDate = calendar.getTime();
            String endDate = dateFormat.format(iterDate);
            //System.out.println("tutaj" + endDate);
            //Conference con = new Conference(language,k,conferenceName,startDate,studentDiscount,city,postalCode,address,email,endDate);
            listConferences.add(new Conference(language,k + 1,conferenceName,startDate,studentDiscount,city,postalCode,address,email,endDate,n));
            //System.out.println(listConferences.get(k));
            outWriter.println(listConferences.get(k));
            n = rand.nextInt(30)+ 20;
            int value =n*10;
            for(int tmp = 0; tmp < 5; tmp++)
            {

                int priceID = priceCounter;
                int conferenceIDPrice = k+1;
                double valuePerDay = value*1.00 - tmp*20;


                Date priceDate = iterDate;
                calendar.setTime(priceDate);
                calendar.add(calendar.DATE,-101 + tmp*20);
                priceDate = calendar.getTime();
                String priceStartDate = dateFormat.format(priceDate);
                calendar.add(calendar.DATE,19);
                priceDate = calendar.getTime();
                String priceEndDate = dateFormat.format(priceDate);

                Price cena = new Price (priceCounter+1,k+1,valuePerDay,priceStartDate,priceEndDate);
                listPrices.add(cena);
               // System.out.println(listPrices.get(priceCounter));
                outWriter.println(listPrices.get(priceCounter));
                calendar.setTime(iterDate);
                priceCounter ++;
            }


            /// dodawanie dni poszczegolnych
           for(int tmp=0;tmp<=listConferences.get(k).getLenght();tmp++)
           {
               String beginning = listConferences.get(k).getStartDate();

               Date beginningDate = dateFormat.parse(beginning);
               calendar.setTime(beginningDate);
               calendar.add(Calendar.DATE,tmp);
               beginningDate = calendar.getTime();
               beginning = dateFormat.format(beginningDate);
             //  System.out.println(beginning);
               int peopleLimit = r.chooseConferenceDayPeopleLimit();

               ConferenceDay cd = new ConferenceDay(conferenceDayCounter+1,k+1,peopleLimit,beginning);
              // System.out.println(cd);
               listConferenceDays.add(cd);
               //System.out.println(listConferenceDays.get(conferenceDayCounter));
               outWriter.println(listConferenceDays.get(conferenceDayCounter));

               n = rand.nextInt(4) + 2;
               String hour0 = "9:00:00";
               Date hourToIter = timeFormat.parse(hour0);
               Calendar timeCalendar = Calendar.getInstance();


               for(int i = 0; i<n;i++)
               {

                   int confID = listConferenceDays.get(conferenceDayCounter).getConferenceID();
                   String languageWorkshop = listConferences.get(confID-1).getLanguage();
                   String subject = r.chooseWorkshopSubject(languageWorkshop);


                   //long oneMinuteInMilis=60000;//millisecs
                   String workshopStart = timeFormat.format(hourToIter);
                   timeCalendar.setTime(hourToIter);
                   timeCalendar.add(Calendar.MINUTE, 60);
                   hourToIter = timeCalendar.getTime();
                   String workshopEnd = timeFormat.format(hourToIter);



                   timeCalendar.setTime(hourToIter);
                   timeCalendar.add(Calendar.MINUTE,5);
                   hourToIter = timeCalendar.getTime();
                    Double workshopMoney = (rand.nextInt(20) + 10)*1.00;
                    int workshopPeopleLimit = rand.nextInt(12) + 10;
                    if(workshopPeopleLimit > 15)
                    {
                       workshopMoney = 0.00;
                    }


                    Workshop w = new Workshop(workshopCounter+1,conferenceDayCounter+1,subject,workshopStart,workshopEnd,workshopPeopleLimit,workshopMoney);
                    listWorkshops.add(w);
                   //System.out.println(w);
                   outWriter.println(w);


                   workshopCounter++;

               }

                conferenceDayCounter++;

               calendar.setTime(iterDate);
           }




            k++;
        }


        Calendar bookingCalendar = Calendar.getInstance();
        int conferenceBookingCounter = 0;
        int conferenceBookingDayCounter= 0;
        int workshopBookingCounter=0;
        for(int i= 0; i<listConferences.size();i++)
        {
            Conference con = listConferences.get(i);
            Random rand = new Random();
            int n = rand.nextInt(960) + 30;
            int step = rand.nextInt (5) + 7;
            List<IndividualClient> selectedIndividual = new ArrayList<>();
            List <Company> selectedCompany = new ArrayList<>();
            List <ConferenceDay> selectedConferenceDay = new ArrayList<>();

            for (int icd = 0 ; icd<listConferenceDays.size();icd++)
            {
                if(listConferenceDays.get(icd).getConferenceID()==con.getConferenceID())
                {
                    selectedConferenceDay.add(listConferenceDays.get(icd));
                }
            }



            for(int j = 0; j<10;j++)
            {
                selectedCompany.add(listCompanies.get(((n+j*step)%999)));

            }
            int kj = 0;
            while(kj<50)
            {
                selectedIndividual.add(listOfIndividualClients.get(((n+1234+kj*step)%1999)));
                kj++;
            }

            kj = 0;
            while(kj<selectedCompany.size())
            {
                int selectedCompanyID = selectedCompany.get(kj).getCompanyID();
                String tmpStartDate = con.getStartDate();
                Date tmpStartDateDate = dateFormat.parse(tmpStartDate);
                bookingCalendar.setTime(tmpStartDateDate);
                n = rand.nextInt(50) + 15;
                bookingCalendar.add(Calendar.DATE,n);
                tmpStartDateDate = bookingCalendar.getTime();
                tmpStartDate = dateFormat.format(tmpStartDateDate);


                ConferenceBooking cb = new ConferenceBooking(conferenceBookingCounter+1,con.getConferenceID(), selectedCompanyID, tmpStartDate);
                listConferenceBooking.add(cb);
                //System.out.println(cb);
                outWriter.println(cb);
                kj++;
                conferenceBookingCounter++;

                for(int q = 0; q<selectedConferenceDay.size();q++)
                {
                    int dayOfConferenceeID = selectedConferenceDay.get(q).getConferenceDayID();
                    n = rand.nextInt(4)+1;
                    int nprim = rand.nextInt(n);
                    ConferenceDayBooking cdb  = new ConferenceDayBooking(conferenceBookingDayCounter+1,dayOfConferenceeID,conferenceBookingCounter,n,nprim);
                    listConferenceDayBooking.add(cdb);

                    ///tu xxz
                    List <Workshop> selectedWorkshops = new ArrayList<>();

                    for (int icd = 0 ; icd<listWorkshops.size();icd++)
                    {

                        if(listWorkshops.get(icd).getDayOfConferenceID() == cdb.getDayOfConferenceID())
                        {
                            selectedWorkshops.add(listWorkshops.get(icd));

                        }
                    }
                    for(int qwe = 0; qwe<selectedWorkshops.size();qwe++)
                    {
                        int selectedWorkshopID = selectedWorkshops.get(qwe).getWorkshopID();
                        int possibleAttendees = cdb.getNumberOfParticipants();
                        possibleAttendees = rand.nextInt(possibleAttendees);
                        if(possibleAttendees > 0)  possibleAttendees = rand.nextInt(possibleAttendees);

                        if(listWorkshops.get(selectedWorkshopID-1).getCurrentOccupancy() + possibleAttendees <= listWorkshops.get(selectedWorkshopID-1).getPeopleLimit() && possibleAttendees>0)
                        {
                            WorkshopBooking wb = new WorkshopBooking(workshopBookingCounter+1,cdb.getConferenceDayBookingID(),selectedWorkshopID,possibleAttendees);
                            listWorkshopBooking.add(wb);
                            double actualWorkshopSummancy = cdb.getPriceOfWorkshops();
                            cdb.setPriceOfWorkshops(actualWorkshopSummancy + possibleAttendees*(listWorkshops.get(wb.getWorkshopID()-1).getPeopleLimit()));

                            workshopBookingCounter++;
                            int attendeesBefore = listWorkshops.get(selectedWorkshopID-1).getCurrentOccupancy();
                            attendeesBefore = attendeesBefore + possibleAttendees;
                            listWorkshops.get(selectedWorkshopID-1).setCurrentOccupancy(attendeesBefore);
                        }
                    }

                    //System.out.println(cdb);
                    outWriter.println(cdb);

                    conferenceBookingDayCounter++;
                }





            }
            kj= 0;
            while(kj<selectedIndividual.size())
            {
                int selectedIndividualID = selectedIndividual.get(kj).getIndividualClientID();
                String tmpStartDate = con.getStartDate();
                Date tmpStartDateDate = dateFormat.parse(tmpStartDate);
                bookingCalendar.setTime(tmpStartDateDate);
                n = rand.nextInt(50) + 15;
                bookingCalendar.add(Calendar.DATE,n);
                tmpStartDateDate = bookingCalendar.getTime();
                tmpStartDate = dateFormat.format(tmpStartDateDate);


                ConferenceBooking cb = new ConferenceBooking(conferenceBookingCounter+1,con.getConferenceID(), selectedIndividualID, tmpStartDate);
                listConferenceBooking.add(cb);
               // System.out.println(cb);
                outWriter.println(cb);
                kj++;
                conferenceBookingCounter++;

                for(int q = 0; q<selectedConferenceDay.size();q++)
                {
                    int dayOfConferenceeID = selectedConferenceDay.get(q).getConferenceDayID();
                    n = rand.nextInt(2)+1;
                    int nprim = rand.nextInt(n);
                    ConferenceDayBooking cdb  = new ConferenceDayBooking(conferenceBookingDayCounter+1,dayOfConferenceeID,conferenceBookingCounter,n,nprim);
                    listConferenceDayBooking.add(cdb);
                    //System.out.println(cdb);
                    outWriter.println(cdb);

                    List <Workshop> selectedWorkshops = new ArrayList<>();

                    for (int icd = 0 ; icd<listWorkshops.size();icd++)
                    {

                        if(listWorkshops.get(icd).getDayOfConferenceID() == cdb.getDayOfConferenceID())
                        {
                            selectedWorkshops.add(listWorkshops.get(icd));

                        }
                    }
                    for(int qwe = 0; qwe<selectedWorkshops.size();qwe++)
                    {
                        int selectedWorkshopID = selectedWorkshops.get(qwe).getWorkshopID();
                        int possibleAttendees = cdb.getNumberOfParticipants();
                        possibleAttendees = rand.nextInt(possibleAttendees);
                        if(listWorkshops.get(selectedWorkshopID-1).getCurrentOccupancy() + possibleAttendees <= listWorkshops.get(selectedWorkshopID-1).getPeopleLimit() && possibleAttendees > 0)
                        {
                            WorkshopBooking wb = new WorkshopBooking(workshopBookingCounter+1,cdb.getConferenceDayBookingID(),selectedWorkshopID,possibleAttendees);
                            listWorkshopBooking.add(wb);
                            double actualWorkshopSummancy = cdb.getPriceOfWorkshops();
                            cdb.setPriceOfWorkshops(actualWorkshopSummancy + possibleAttendees*(listWorkshops.get(wb.getWorkshopID()-1).getPeopleLimit()));
                            workshopBookingCounter++;
                            int attendeesBefore = listWorkshops.get(selectedWorkshopID-1).getCurrentOccupancy();
                            attendeesBefore = attendeesBefore + possibleAttendees;
                            listWorkshops.get(selectedWorkshopID-1).setCurrentOccupancy(attendeesBefore);
                        }
                    }


                    conferenceBookingDayCounter++;
                }
            }
        }

     /*   for(int i=0 ; i<5000;i++)
        {
            String firstName = r.randomString (listFirstNames);
            String  lastName = r.randomString (listLastNames);
            String mail = r.createEmail(firstName,lastName);
            Participant p = new Participant(i+1,firstName, lastName, mail);
            listParticipant.add(p);
            System.out.println(p);
        }
    */
        for(int i=0;i<listConferenceBooking.size();i++)
        {
            ConferenceBooking cb = listConferenceBooking.get(i);
            Random rn = new Random();

            double valueOfBooking = 1.00*(rn.nextInt(234)+ 500);
            double discount = listConferences.get(cb.getConferenceID()-1).getStudentDiscount();
            double pricePerDay = 0;
            for(int j=0; j<listPrices.size();j++)
            {
                Date d1 = dateFormat.parse(listPrices.get(j).getStartdate());
                Date d2 = dateFormat.parse(listPrices.get(j).getEndDate());
                Date dd = dateFormat.parse(cb.getBookingDate());
                if(dd.compareTo(d1)>=0 && dd.compareTo(d2) <= 0 && listPrices.get(j).getConferenceID() == cb.getConferenceID())
                {
                    pricePerDay = listPrices.get(j).getValuePerDay();
                }
            }

            List <ConferenceDayBooking> selectedConferenceDayBooking = new ArrayList<>();

            for (int icd = 0 ; icd<selectedConferenceDayBooking.size();icd++)
            {

                if(listConferenceDayBooking.get(icd).getConferenceBookingID() == cb.getConferenceBookingID());
                {
                    selectedConferenceDayBooking.add(listConferenceDayBooking.get(icd));


                }
            }
            for (int icd = 0 ; icd<selectedConferenceDayBooking.size();icd++)
            {
                valueOfBooking = valueOfBooking + (selectedConferenceDayBooking.get(icd).getNumberOfParticipants()- selectedConferenceDayBooking.get(icd).getNumberOfStudents())*pricePerDay +
                        selectedConferenceDayBooking.get(icd).getNumberOfStudents()*pricePerDay*(1-discount);
            }
            Date lolo = dateFormat.parse(cb.getBookingDate());
            Calendar tmpCalendar = Calendar.getInstance();
            tmpCalendar.setTime(lolo);
            tmpCalendar.add(Calendar.DATE,2);
            lolo = tmpCalendar.getTime();
            String bookingDateToInsert = dateFormat.format(lolo);
            Payment p = new Payment(paymentCounter+1,valueOfBooking,bookingDateToInsert,cb.getConferenceBookingID());
            listPayment.add(p);




            paymentCounter ++;


        }


        for(int i = 0; i<listConferenceDayBooking.size();i++)
        {
            ConferenceDayBooking cdb = listConferenceDayBooking.get(i);
            int avoidMistakes = 0;

            List<WorkshopBooking> selectedWorkshopBooking = new ArrayList<>();
            for(int j = 0 ; j<listWorkshopBooking.size(); j++)
            {
                if(listWorkshopBooking.get(j).getConferenceDayBookingID() == cdb.getConferenceDayBookingID())
                {
                    selectedWorkshopBooking.add(listWorkshopBooking.get(j));
                }
            }
            int normal = cdb.getNumberOfParticipants() - cdb.getNumberOfStudents();
            int amaountOfStudents = cdb.getNumberOfStudents();



            for(int qaz = 0; qaz < normal; qaz++)
            {
                Random rand = new Random();
                int n = rand.nextInt(4889) + 1;

                DayReservation dr = new DayReservation(dayReservationCounter+1,cdb.getConferenceDayBookingID(),n,0,"NULL","NULL");
                listDayReservation.add(dr);




                for(int wsx = 0; wsx<selectedWorkshopBooking.size();wsx++)
                {
                    WorkshopBooking wb = selectedWorkshopBooking.get(wsx);
                    for(int edc = 0; edc < wb.getNumberOfParticipnats() && avoidMistakes == 0;edc++)
                    {
                        WorkshopReservation wr = new WorkshopReservation(workshopReservationCounter+1,dr.getDayReservationID(),wb.getWorkshopBookingID());
                        listWorkshopReservation.add(wr);
                        workshopReservationCounter++;
                    }
                    avoidMistakes = 1;
                }
                dayReservationCounter++;
                avoidMistakes = 0;
            }
            for(int qaz = 0; qaz < amaountOfStudents; qaz++)
            {
                Random rand = new Random();
                int n = rand.nextInt(4889) + 1;

                DayReservation dr = new DayReservation(dayReservationCounter+1,cdb.getConferenceDayBookingID(),n,1,r.createStudentCard(),r.createUniversity());
                listDayReservation.add(dr);

                for(int wsx = 0; wsx<selectedWorkshopBooking.size();wsx++)
                {
                    WorkshopBooking wb = selectedWorkshopBooking.get(wsx);
                    for(int edc = 0; edc < wb.getNumberOfParticipnats() && avoidMistakes == 0 && normal == 0;edc++)
                    {
                        WorkshopReservation wr = new WorkshopReservation(workshopReservationCounter+1,dr.getDayReservationID(),wb.getWorkshopBookingID());
                        listWorkshopReservation.add(wr);
                        workshopReservationCounter++;
                    }
                    avoidMistakes = 1;
                }
                dayReservationCounter++;
                avoidMistakes = 0;
            }








        }





      //  for (int jok= 0; jok<listPayment.size();jok++)
      //  {
      //      System.out.println(listPayment.get(jok));
      //  }

        /*for (int i = 0 ;i<listCompanies.size(); i++)
        {
            System.out.println(listCompanies.get(i));
        }




        for (int i = 0 ;i<listOfIndividualClients.size(); i++)
        {
            System.out.println(listOfIndividualClients.get(i));
        }
        */

        for (int i = 0 ;i<listConferences.size(); i++)
        {
            System.out.println(listConferences.get(i));
        }

        for (int i = 0 ;i<listPrices.size(); i++)
        {
            System.out.println(listPrices.get(i));
        }
        for (int i = 0 ;i<listConferenceDays.size(); i++)
        {
            System.out.println(listConferenceDays.get(i));
        }
        for (int i = 0 ;i<listWorkshops.size(); i++)
        {
            System.out.println(listWorkshops.get(i));
        }
        for (int i = 0 ;i<listConferenceBooking.size(); i++)
        {
            System.out.println(listConferenceBooking.get(i));
        }


        for (int i = 0 ;i<listConferenceDayBooking.size(); i++)
        {
            System.out.println(listConferenceDayBooking.get(i));
        }
        for (int i = 0 ;i<listWorkshopBooking.size(); i++)
        {
            System.out.println(listWorkshopBooking.get(i));
        }

        for (int i = 0 ;i<listDayReservation.size(); i++)
        {
            System.out.println(listDayReservation.get(i));
        }

        for (int i = 0 ;i<listWorkshopReservation.size(); i++)
        {
            System.out.println(listWorkshopReservation.get(i));
        }


        for (int i = 0 ;i<listPayment.size(); i++)
        {
            System.out.println(listPayment.get(i));
        }
        outWriter.close();




       // for (int i = 0 ;i<listPayment.size(); i++)
       // {
       //   System.out.println(listPayment.get(i));
        //}

    }
}
