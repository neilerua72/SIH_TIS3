package princetonPlainsboro;

// Cette enumeration fait intervenir des valeurs qui possedent des
// attributs ('libelle' et 'cout') qui sont initialises par un appel du
// constructeur (arguments entre parentheses apres le nom de chaque valeur).
// Par exemple, la valeur Code.FP a un attribut 'libelle' contenant la chaine
// de caracteres "forfait pediatrique" et un attribut 'cout' ayant la valeur 5.0

enum Code {
    // valeurs de l'�num :
    C("Consultation au cabinet par le m�decin g�n�raliste, le chirurgien-dentiste omnipraticien ou la sage-femme",23.0),
    CS("Consultation au cabinet par le m�decin sp�cialiste qualifi�, le m�decin sp�cialiste qualifi� en m�decine g�n�rale ou le chirurgien-dentiste sp�cialiste qualifi�",26.0),
    APC("Avis ponctuel de consultant pour une consultation au cabinet du m�decin sp�cialiste",50.0),
    APY("Avis ponctuel de consultant pour une consultation au cabinet d'un psychiatre, neuropsychiatre ou d'un neurologue",62.50),
    APU("Avis ponctuel de consultant pour une consultation d'un professeur des universit�s-praticien hospitalier",69.0),
    CCP("Consultation de contraception et de pr�vention",46.0),
    U03("Consultation correspondant au niveau CCMU 3 du m�decin urgentiste",30.0),
    U45("Consultation correspondant au niveau CCMU 4 ou au niveau CCMU 5 du m�decin urgentiste",46.0),
    COE("Consultation obligatoire de l'enfant",46.0),
    CSC("Consultation sp�cifique au cabinet par un m�decin sp�cialiste en pathologie cardiovasculaire ou en cardiologie et m�decine des affections vasculaires",45.73),
    CNPSY("Consultation au cabinet par le m�decin neuropsychiatre qualifi�, psychiatre qualifi� ou neurologue qualifi�",28.0),
    CDE("Consultation de d�pistage du m�lanome r�alis�e au cabinet par un m�decin sp�cialiste en dermatologie",22.0),
    KA("Actes de chirurgie et de sp�cialit� pratiqu�s par le m�decin (selon les dispositions de l'article III-1 du Livre III de la d�cision UNCAM du 11/03/05)",1.92),
    KMB("Pr�l�vement par ponction veineuse directe r�alis�e par le m�decin biologiste",6.0),
    Z("Actes utilisant les radiations ionisantes pratiqu� par le m�decin (selon les dispositions de l'article III-1 du Livre III de la d�cision UNCAM du 11/03/05) ou le chirurgien-dentiste",25.5),
    ORT("Traitements d'orthop�die dento-faciale pratiqu�s par le m�decin",2.15),
    TO("Traitements d'orthop�die dento-faciale pratiqu�s par le chirurgien-dentiste",28.0),
    SP("s�ance de suivi postnatal r�alis� par la sage-femme",18.0),
    SF("Actes pratiqu�s par la sage-femme",18.0),
    SFI("Soins infirmiers pratiqu�s par la sage-femme",12.0),
    AMS("Actes de r��ducation des affections orthop�diques et rhumatologiques effectu� par le masseur-kin�sith�rapeute",48.0),
    AMC("Actes pratiqu�s par le masseur-kin�sith�rapeute dans une structure de soins ou un �tablissement, y compris lorsque le malade y a �lu domicile, autre que ceux qui donnent lieu � application de la lettre cl� AMK",28.0), 
    AMI("Actes pratiqu�s par l'infirmier ou l'infirmi�re, � l'exception des actes infirmiers de soins qui donnent lieu � application de la lettre cl� AIS",12.0),
    DI("D�marche de soins infirmiers",18.0),
    AMP("Actes pratiqu� par le p�dicure",25.0),
    POD("Acte de pr�vention pratiqu� par le p�dicure-podologue",10.0),
    AMO("Actes pratiqu� par l'orthophoniste",18.0),
    AMY("Acte pratiqu� par l'orthoptiste",30.0);

                             
    // attributs de l'�num :
    private String libelle;
    private double cout;
    
    // constructeur :
    private Code(String libelle, double cout) {
        this.libelle = libelle;
        this.cout = cout;
        }
    
    // m�thodes :
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
