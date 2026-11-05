<div align="center">

# ☕ Java SE 17 — Part 7: Interfaces & Abstract Types

### Master interfaces, enums, sealed classes, records & polymorphism and prepare for the OCP 1Z0-829 certification

**Source code for the video course by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-SE%2017-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![YouTube](https://img.shields.io/badge/Watch%20on-YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://tinyurl.com/java17fundamental)

</div>

---

## 📖 About this repository

This repository contains **all the code examples** shown in **Part 7 — Interfaces & Abstract Types** of the *Java SE 17 Full Course* on the **ADC with Mounir** YouTube channel.

Every folder matches one video. Open the folder, follow along with the video, run the code, break it, fix it — that is the fastest way to really learn Java.

All examples are built around the same **streaming-platform project** as Part 6 (`Content`, `Movie`, `Series`, `Episode`, `User`, `Subscription`, `ContentType`…), so every new type has a real, meaningful job: interfaces that describe what content can do, enums with their own fields and methods, sealed hierarchies that list every allowed subtype, records that carry data without boilerplate, nested classes, and polymorphism that lets one reference play any kind of content.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Learners who finished Part 6** — comfortable with inheritance, constructors and abstract classes | Follow the folders in order, one video at a time |
| 🔵 | **Developers coming from JavaScript, Python, C# or Kotlin** | Jump to the topics you need — Java's interface, enum and record rules have their own quirks |
| 🟠 | **OCP 1Z0-829 candidates** | Focus on the 🎓 exam traps and practice questions in each video — interface method rules, sealed classes, records and casting are heavily tested |

---

## 🗂️ Course content

| # | Folder | Video topic | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 1 | `Part_7_1_Interfaces_Abstract_Types` | **Interfaces** | Declaring and implementing interfaces, `default`, `static` and `private` interface methods, multiple inheritance of behavior | ✅ |
| 2 | `Part_7_2_Interfaces_Abstract_Types` | **Enums** | Enums with fields, constructors and methods, `values()` / `valueOf()` / `ordinal()`, enums in `switch` | ✅ |
| 3 | `Part_7_3_Interfaces_Abstract_Types` | **Sealed classes** | `sealed`, `permits`, `final` and `non-sealed` subclasses, sealed interfaces | ✅ |
| 4 | `Part_7_4_Interfaces_Abstract_Types` | **Records** | Compact and canonical constructors, accessors, immutability, what you can and can't add to a record | ✅ |
| 5 | `Part_7_5_Interfaces_Abstract_Types` | **Nested classes** | Inner, static nested, local and anonymous classes, and what each one can access | ✅ |
| 6 | `Part_7_6_Interfaces_Abstract_Types` | **Polymorphism** | Object vs. reference type, casting, `instanceof` and pattern matching, virtual method calls | 🔜 |
| 7 | NO LABS (see the video) | **Chapter Review & Practice Questions** | Summary, exam essentials and OCP-style practice questions | 🔜 |

> ✅ Available · 🔜 Coming soon — the repo is updated as new videos are released.

---

## 🎓 OCP 1Z0-829 objectives covered

- **Utilizing Java object-oriented approach**
  - Declare and instantiate Java objects including nested class objects, and explain the object life-cycle
  - Create classes and records, and define and use instance and static fields and methods, constructors, and initializers
  - Understand variable scopes, apply encapsulation, and make objects immutable
  - Implement polymorphism and differentiate object type versus reference type; perform type casting, identify object types using the `instanceof` operator and pattern matching
  - Create and use interfaces, identify functional interfaces, and utilize `private`, `static`, and `default` interface methods
  - Create and use enumerations with fields, methods and constructors

---

## 🛠️ Prerequisites

- **JDK 17** installed ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the course uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)
- Comfort with **inheritance and abstract classes** (covered in [Part 6](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics))

Check your installation:

```bash
javac -version   # should print 17.x
java  -version   # should print 17.x
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types.git
cd Java17_Part_7_Interfaces_Abstract_Types

# 2. Open the folder of the video you are watching
cd Part_7_1_Interfaces_Abstract_Types
```

Each folder is independent. You can open it directly in VS Code, or compile and run from the terminal:

```bash
# Compile all the classes of the folder
javac *.java

# Run the class that has the main method (no .class extension!)
java StreamingPlatform
```

---

## 📺 Watch the course

| Resource | Link |
|---|---|
| 📃 Part 1 playlist (start here if you're new) | [tinyurl.com/java17fundamental](https://tinyurl.com/java17fundamental) |
| 📃 Part 6 playlist (the previous part) | [tinyurl.com/java17objectorientedbasics](https://tinyurl.com/java17objectorientedbasics) |
| 💻 Source code (this repo) | [github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types](https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types) |

---

## 🧭 Course roadmap

This repository is **Part 7** of a complete Java SE 17 course. Each part has its own repository.

| Part | Topic | Status |
|:-:|---|:-:|
| 1 | [Java Fundamentals / Core Syntax](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax) | ✅ |
| 2 | Expressions & Computations | 🔜 |
| 3 | Control Flow & Conditionals | 🔜 |
| 4 | Essential Java Libraries | 🔜 |
| 5 | Functions & Parameters | 🔜 |
| 6 | [Object-Oriented Basics](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics) | ✅ |
| 7 | [Interfaces & Abstract Types](https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types) | 🚧 |
| 8 | [Functional Programming](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming) | ✅ |
| 9 | Data Structures & Type Safety | 🔜 |
| 10 | Data Processing Pipelines | 🔜 |
| 11 | Error Handling & i18n | 🔜 |
| 12 | Java Module System (JPMS) | 🔜 |
| 13 | Multithreading & Parallelism | 🔜 |
| 14 | File & Stream Operations | 🔜 |
| 15 | Database Connectivity | 🔜 |

> ✅ Available · 🚧 In progress · 🔜 Coming soon

---

## 📚 Recommended reading

This course is inspired by, and complements, the official study guide:

> **OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829**
> Scott Selikoff & Jeanne Boyarsky — Sybex

The course does not replace the book. All code, explanations and practice questions in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you learn Java, give it a star — it helps other learners find it!**

Made with ☕ by **ADC with Mounir**

</div>
