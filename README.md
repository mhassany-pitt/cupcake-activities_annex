# Cupcake AnnEx Worked Examples

Worked examples with line-by-line pedagogical annotations unified from **AnnEx** (ACOS) and **WebEx** (PAWS) in the ADAPT / Smart Learning Content (SLC) Catalog:

https://adapt2.sis.pitt.edu/next.course-authoring/#/catalog-v2

## Contents

This repository contains **786 worked-example activities** conforming to the Cupcake `worked-example/0.1.0` specification:

- **Unified Collection**: Integrates all 604 AnnEx items and 182 unique WebEx items into a single, cohesive repository without duplicate activities.
- **Enriched Pedagogical Annotations**: Overlapping C++ textbook figure examples that lacked comments in AnnEx were backfilled and enriched with WebEx's original, rich line-by-line pedagogical annotations.
- **Language Separation**: Cleanly partitioned at the top level into:
  - `java/` (**340 activities**): Object-oriented programming, data structures (linked lists, trees, stacks, queues), sorting, searching, recursion, and exception handling from CSEdPad.
  - `python/` (**103 activities**): 102 comprehensive worked examples from WebEx covering control flow, functions, dictionaries, file I/O, OOP, and exceptions, plus AnnEx's primitive printing example.
  - `cpp/` (**149 activities**): Modern C++ concepts (`c_ch2_*`) and Deitel textbook figure adaptations enriched with line annotations.
  - `c/` (**62 activities**): University of Pittsburgh IS12 course examples (`arraysum.c`, `babyweighting.c`, `battleship.c`, `recfactorial.c`, `countdown1.c`, etc.).
  - `sql/` (**132 activities**): Relational queries covering `SELECT`, subqueries, joins, grouping, view creation, and updates, including bilingual English and Portuguese (`_pt.yaml`) annotations.
- **Precise Snippet Locators**: Every explanation references its exact source code line via `location.snippet` and `location.nth`, fully verified against the source files for seamless rendering in the Cupcake editor.
- **Complete Attribution**: Full author metadata with academic affiliations (University of Pittsburgh, Indiana University of Pennsylvania, University of Memphis, etc.) and university emails.
- **Differentiated Topics**: Knowledge Component topics in `pedagogy.topics` are namespaced by parser/ontology (e.g. `java_ontology:Array`, `sql_concept:Join`, `webex:Loop`).

## Layout

```
java/
  └── csedpad_sorting_bubblesort/
      ├── BubbleSort.java
      └── csedpad_sorting_bubblesort_en.yaml

python/
  └── pytt10_25/
      ├── main.py
      └── pytt10_25_en.yaml

cpp/
  └── ForLoop/
      ├── main.cpp
      └── ForLoop_en.yaml

c/
  └── arraysum/
      ├── main.c
      └── arraysum_en.yaml

sql/
  └── DataSelection35_version_1_pt/
      ├── query.sql
      └── DataSelection35_version_1_pt.yaml
```
