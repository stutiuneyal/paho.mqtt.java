package org.eclipse.paho.sample.mqttv3app;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please specify which example to run: sample-async-callback | sample-async-wait | sample");
            System.exit(1);
        }

        String mode = args[0].toLowerCase();
        switch (mode) {
            case "sample-async-callback":
                SampleAsyncCallBack.main(sliceArgs(args));
                break;
            case "sample-async-wait":
                SampleAsyncWait.main(sliceArgs(args));
                break;
            case "sample":
                Sample.main(sliceArgs(args)); // If you're referring to the Sample.java class from above
                break;
            default:
                System.err.println("Unknown option: " + mode);
                System.exit(1);
        }
    }

    private static String[] sliceArgs(String[] args) {
        if (args.length <= 1) return new String[0];
        String[] sliced = new String[args.length - 1];
        System.arraycopy(args, 1, sliced, 0, sliced.length);
        return sliced;
    }
}
