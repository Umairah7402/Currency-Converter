package assignment1;

public class CurrencyConverter {
    private String fromCurrency, toCurrency;
        private double amount,convertedAmount;

        public CurrencyConverter(String fromCurrency, String toCurrency,double amount){
            this.fromCurrency=fromCurrency;
            this.toCurrency=toCurrency;
            this.amount=amount;
        }
        public void getConvertedAmount(){
            if(fromCurrency.toUpperCase().equals("MYR"))
                calculateFromMYR();
            else
                if(fromCurrency.toUpperCase().equals("USD"))
                    calculateFromUSD();
            else
                    if(fromCurrency.toUpperCase().equals("EUR"))
                        calculateFromEUR();
        }
        
        private double calculateFromMYR(){
            if(toCurrency.toUpperCase().equals("USD"))
               convertedAmount = amount*0.24;
            else
                if(toCurrency.toUpperCase().equals("EUR"))
                    convertedAmount = amount*0.20;
            else
                    convertedAmount = amount;
            
            return convertedAmount;
        }
        private double calculateFromUSD(){
        if(toCurrency.toUpperCase().equals("MYR"))
               convertedAmount = amount*4.23;
            else
                if(toCurrency.toUpperCase().equals("EUR"))
                    convertedAmount = amount*0.85;
            else
                    convertedAmount = amount;
            
            return convertedAmount;
        }
        
        private double calculateFromEUR(){
        if(toCurrency.toUpperCase().equals("MYR"))
               convertedAmount = amount*4.98;
            else
                if(toCurrency.toUpperCase().equals("USD"))
                    convertedAmount = amount*1.18;
            else
                    convertedAmount = amount;
            
            return convertedAmount;
        }
        
        public String toString(){
            return String.format("\n%.2f %3s = %.2f %3s \n", amount,fromCurrency.toUpperCase(),convertedAmount,toCurrency.toUpperCase());
        } 
}
