Tachyon-Mesos
=============

> _A Mesos Framework for Tachyon._

## Prerequisites

- A Mesos cluster
- Java JDK

## Design

### Tachyon-Mesos Scheduler

The scheduler:

- registers as a framework with a Mesos master
- links against the tachyon library and starts a Tachyon Master
  in the same process.
- launches Tachyon worker processes on Mesos

