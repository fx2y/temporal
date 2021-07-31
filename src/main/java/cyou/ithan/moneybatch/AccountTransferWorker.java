package cyou.ithan.moneybatch;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

public class AccountTransferWorker {
    @SuppressWarnings("CatchAndPrintStackTrace")
    public static void main(String[] args) {
        WorkflowServiceStubs service = WorkflowServiceStubs.newInstance();
        WorkflowClient client = WorkflowClient.newInstance(service);
        WorkerFactory factory = WorkerFactory.newInstance(client);
        Worker worker = factory.newWorker(AccountActivityWorker.TASK_QUEUE);
        worker.registerWorkflowImplementationTypes(AccountTransferWorkflowImpl.class);
        factory.start();
        System.out.println("Worker started for task queue: " + AccountActivityWorker.TASK_QUEUE);
    }
}
