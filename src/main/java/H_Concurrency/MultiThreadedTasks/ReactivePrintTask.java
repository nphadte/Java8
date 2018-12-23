package H_Concurrency.MultiThreadedTasks;

import java.util.concurrent.Callable;

public class ReactivePrintTask implements Callable {

        private String taskName;
        private int    sleepTime;

        public ReactivePrintTask() {
        }

        public ReactivePrintTask(String taskName, int sleepTime) {
                this.taskName = taskName;
                this.sleepTime = sleepTime;
        }

        @Override
        public Object call() throws Exception {
                return null;
        }
}
