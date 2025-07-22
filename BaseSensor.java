public class BaseSensor {
        protected String sensorName;
        protected boolean isCalibrated;
        
        public BaseSensor(String name) {
            this.sensorName = name;
            this.isCalibrated = false;
        }
        
        public void calibrate() {
            this.isCalibrated = true;
        }
        
        public double readValue() {
            if (!isCalibrated) {
                return -1;
            }
            return Math.random();
        }
        
        public void reset() {
            this.isCalibrated = false;
        }
    }


