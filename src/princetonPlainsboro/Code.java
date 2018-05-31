package princetonPlainsboro;

// Cette enumeration fait intervenir des valeurs qui possedent des
// attributs ('libelle' et 'cout') qui sont initialises par un appel du
// constructeur (arguments entre parentheses apres le nom de chaque valeur).
// Par exemple, la valeur Code.FP a un attribut 'libelle' contenant la chaine
// de caracteres "forfait pediatrique" et un attribut 'cout' ayant la valeur 5.0

enum Code {
    // valeurs de l'ï¿½num :
    C("Consultation au cabinet par le médecin généraliste, le chirurgien-dentiste omnipraticien ou la sage-femme",23.0),
    CS("Consultation au cabinet par le médecin spécialiste qualifié, le médecin spécialiste qualifié en médecine générale ou le chirurgien-dentiste spécialiste qualifié",26.0),
    APC("Avis ponctuel de consultant pour une consultation au cabinet du médecin spécialiste",50.0),
    APY("Avis ponctuel de consultant pour une consultation au cabinet d'un psychiatre, neuropsychiatre ou d'un neurologue",62.50),
    APU("Avis ponctuel de consultant pour une consultation d'un professeur des universités-praticien hospitalier",69.0),
    CCP("Consultation de contraception et de prévention",46.0),
    U03("Consultation correspondant au niveau CCMU 3 du médecin urgentiste",30.0),
    U45("Consultation correspondant au niveau CCMU 4 ou au niveau CCMU 5 du médecin urgentiste",46.0),
    COE("Consultation obligatoire de l'enfant",46.0),
    CSC("Consultation spécifique au cabinet par un médecin spécialiste en pathologie cardiovasculaire ou en cardiologie et médecine des affections vasculaires",45.73),
    CNPSY("Consultation au cabinet par le médecin neuropsychiatre qualifié, psychiatre qualifié ou neurologue qualifié",28.0),
    CDE("Consultation de dépistage du mélanome réalisée au cabinet par un médecin spécialiste en dermatologie",22.0),
    KA("Actes de chirurgie et de spécialité pratiqués par le médecin (selon les dispositions de l'article III-1 du Livre III de la décision UNCAM du 11/03/05)",1.92),
    KMB("Prélèvement par ponction veineuse directe réalisée par le médecin biologiste",6.0),
    Z("Actes utilisant les radiations ionisantes pratiqué par le médecin (selon les dispositions de l'article III-1 du Livre III de la décision UNCAM du 11/03/05) ou le chirurgien-dentiste",25.5),
    ORT("Traitements d'orthopédie dento-faciale pratiqués par le médecin",2.15),
    TO("Traitements d'orthopédie dento-faciale pratiqués par le chirurgien-dentiste",28.0),
    SP("séance de suivi postnatal réalisé par la sage-femme",18.0),
    SF("Actes pratiqués par la sage-femme",18.0),
    SFI("Soins infirmiers pratiqués par la sage-femme",12.0),
    AMS("Actes de rééducation des affections orthopédiques et rhumatologiques effectué par le masseur-kinésithérapeute",48.0),
    AMC("Actes pratiqués par le masseur-kinésithérapeute dans une structure de soins ou un établissement, y compris lorsque le malade y a élu domicile, autre que ceux qui donnent lieu à  application de la lettre clé AMK",28.0), 
    AMI("Actes pratiqués par l'infirmier ou l'infirmière, à  l'exception des actes infirmiers de soins qui donnent lieu à  application de la lettre clé AIS",12.0),
    DI("Démarche de soins infirmiers",18.0),
    AMP("Actes pratiqué par le pédicure",25.0),
    POD("Acte de prévention pratiqué par le pédicure-podologue",10.0),
    AMO("Actes pratiqué par l'orthophoniste",18.0),
    AMY("Acte pratiqué par l'orthoptiste",30.0);

                             
    // attributs de l'ï¿½num :
    private String libelle;
    private double cout;
    
    // constructeur :
    private Code(String libelle, double cout) {
        this.libelle = libelle;
        this.cout = cout;
        }
    
    // mï¿½thodes :
    public String toString() {
        return super.toString() + " : " + libelle + ", cout=" + cout + " euros";
        }
    
    // calcule le prix pour un coefficient donne :
    public double calculerCout(int coefficient) {
        return coefficient * cout;
        }
    public String recupCode(){
        return super.toString();
    }
    }
