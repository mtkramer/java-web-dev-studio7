package org.launchcode.studio7;

public class DVD extends OpticalStorage implements Spinner {

    private Boolean isSpinning = false;

    public DVD(double gigaByteStorageCapacity) {
        super(gigaByteStorageCapacity);
    }

    @Override
    public Boolean spinDisc() {
        this.isSpinning = !this.isSpinning;
        return this.isSpinning;
    }

}
