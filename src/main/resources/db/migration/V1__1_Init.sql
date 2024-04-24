CREATE TABLE task
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    title      VARCHAR(100) NOT NULL,
    memo       VARCHAR(255) NOT NULL,
    status     VARCHAR(20)  NOT NULL,
    start_date datetime NULL,
    due_date   datetime NULL,
    CONSTRAINT pk_task PRIMARY KEY (id)
);

CREATE INDEX idx_task_due_date ON task (due_date DESC);

CREATE INDEX idx_task_start_date ON task (start_date DESC);

CREATE INDEX idx_task_status ON task (status);
