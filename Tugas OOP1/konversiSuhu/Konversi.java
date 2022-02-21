package konversiSuhu;

public class Konversi
{
  double keReamur(double c){
    // R = C * 0.8
    return(c * 0.8);
  }
  double keFahrenheit(double c){
    // F = C * 1.8 + 32
    return(c * 1.8 +32);
  }
  double keKelvin(double c){
    // K = C + 273
    return(c + 273);
  }
  String kondisiAir(double k){
    if (k < 0) {
      return("Kondisi Air Beku");
    } 
    else if(k > 0 && k < 100) {
      return("Kondisi Air Normal");
    } 
    else {
      return("Kondisi Air Mendidih");
    }
  }
}