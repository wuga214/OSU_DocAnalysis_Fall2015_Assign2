# OSU_DocAnalysis_Fall2015_Assign2

Step by Step instruction:
===
Please see [Assignment 2](https://github.com/wuga214/OSU_DocAnalysis_Fall2015_Assign2/blob/master/IE_Assignment_Description.pdf) for full instructions on the lab and assignment and what specifically should be completed and submitted.  However, in brief, the lab and assignment tasks are as follows:

1. You will train a conditional random field (CRF) based named entity recognizer (NER) using CRF++ and CoNLL NER data, experiment with various features and model configurations, and comparatively evaluate results on test data.

2. You will build a function to extract key text content from articles on a news webpage and transform it into the format for CRF++ labeling.  You will invoke CRF++ labeling on the extracted text using your trained model and list all NERS found, one per line.

Submission:
===
Submit your assignment on [Canvas](https://oregonstate.instructure.com/courses/1577985)

Windows CRF++ Official Binary Downloads
===
Get them [here](https://drive.google.com/folderview?id=0B4y35FiV1wh7fngteFhHQUN2Y1B5eUJBNHZUemJYQV9VWlBUb3JlX0xBdWVZTWtSbVBneU0&usp=drive_web#list)

Important facts:
===
1. to add new columns in training data of CONLL2003, note the headline is like: "-DOCSTART- O", you need to add a new symbol ,"-X-", in headline. e.g.: "-DOCSTART- -X- O" for two feature columnS training data.
