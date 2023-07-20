package ArmaduraIROMAN;

import java.util.ArrayList;

class Radar {

    float resistance;
    float x;
    float y;
    float z;
    boolean hostile;

    public Radar() {
    }

    public Radar(float resistance, float x, float y, float z, boolean hostile) {
        this.resistance = resistance;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostile = hostile;
    }

    public float getResistance() {
        return resistance;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setResistance(float resistance) {
        this.resistance = resistance;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    @Override
    public String toString() {
        return " Resistance " + resistance + ", x(" + x + "), y(" + y + "), z(" + z + "), hostile (" + hostile +")";
    }

    public float calcularDistancia(Radar objeto, float xRef, float yRef, float zRef) {
        float dx = objeto.getX() - xRef;
        float dy = objeto.getY() - yRef;
        float dz = objeto.getZ() - zRef;

        return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

   

    public float decrementarResistencia(float r, float potencia) {
        return r -= potencia;
    }

}
