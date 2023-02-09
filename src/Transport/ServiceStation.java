package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
        private Queue<Transport> queue;

        public ServiceStation() {
            this.queue = new LinkedList<>();
        }

        public void addCarQueue(Transport transport) {
            queue.offer(transport);
        }

        public void performMaintenance() {
            while (queue.peek() != null) {
                System.out.println(queue.poll());
            }
        }
}
