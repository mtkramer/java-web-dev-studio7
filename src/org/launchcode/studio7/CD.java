package org.launchcode.studio7;

public class CD extends OpticalStorage implements Spinner {

    private Boolean isSpinning = false;

    public CD(double gigaByteStorageCapacity) {
        super(gigaByteStorageCapacity);
    }

    @Override
    public Boolean spinDisc() {
        this.isSpinning = !this.isSpinning;
        return this.isSpinning;
    }


}
