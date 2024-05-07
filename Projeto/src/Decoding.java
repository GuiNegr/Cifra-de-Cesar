public class Decoding{
    private char[] alfa = {'A','B','C','D','E','F','G','H','I',
    'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };

    public String instCod(String cod){
        cod = cod.toUpperCase();
        String aux = "";
        for(int i = 0; i < cod.length();i++){
            char help = cod.charAt(i);
            if(help == 'X'){
                aux += 'A';
            }else if (help == 'Y') {
                aux += 'B';
            }else if (help == 'Z') {
                aux += 'C';
            } else if (help == ' ') {
                aux += ' ';
            } else {
                for (int j = 0; j < alfa.length; j++) {
                     if(help == alfa[j]){
                        int a = j + 3;
                        help = alfa[a];
                        break;
                    }
                }
                aux += help;
                }
                }
        return aux;
            }


        public String isdecodding(String descod){
            descod = descod.toUpperCase();
            String aux = "";
            for(int i = 0; i < descod.length();i++){
                char help = descod.charAt(i);
                if(help == 'A'){
                    aux += 'X';
                }else if (help == 'B') {
                    aux += 'Y';
                }else if (help == 'C') {
                    aux += 'Z';
                }else if (help == ' ') {
                    aux += ' ';
                }else {
                    for (int j = 3; j < alfa.length; j++) {
                        if(help == alfa[j]){
                            int a = j - 3;
                            help = alfa[a];
                            break;
                        }
                    }
                    aux += help;
                }
            }
            return aux;
        }
        }

