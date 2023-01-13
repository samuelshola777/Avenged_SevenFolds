package justExercise;

public class ValidateNetWorkPhoneNumberz {

    public boolean validateForMtN(String mntNumberZ) {
        String [] mntNumber = {"0803","0806","0703","0706","0813","0816"
                ,"0810","0814","0903","0906","0913","0916","07025","07025","07026","0704"};
        for (int i = 0; i < mntNumber.length; i++) {
                if (mntNumber[i].equals(mntNumberZ)){
                    return true;
                }
        }
return false;
    }

    public boolean validForAirtel(String airtel) {
        String [] airtelNumbers = {"0802","0808","0708","0812","0701","0901","0904","0907","0912"};
        for (int i = 0; i < airtelNumbers.length; i++) {
            if (airtelNumbers[i].equals(airtel)){
                return true;
            }
        }
        return false;
    }

    public boolean validateForGLo(String glo) {
        String [] gloNumbers = {"0805","0905","0807","0811","0705","0815"};
        for (int i = 0; i < gloNumbers.length; i++) {
            if (gloNumbers[i].equals(glo)){
                return true;
            }
        }
        return false;
    }

    public boolean validateForEtisalat(String etisalat) {
        String [] etisalatNumbers = {"0909","0908","0818","0809","0817"};
        for (int i = 0; i < etisalatNumbers.length; i++) {
            if (etisalatNumbers[i].equals(etisalat)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateForVisaFone(String visaFone) {
        String [] visaFoneNumbers = {"0704","07026","07025"};
        for (int i = 0; i < visaFoneNumbers.length; i++) {
            if (visaFoneNumbers[i].equals(visaFone)){
                return  true;
            }
        }
        return false;
    }
}
