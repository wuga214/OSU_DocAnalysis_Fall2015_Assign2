#Read me

Please check all functions under nlp and web.reader packages!<\br>
Each of them has main function that show an example of how to use it.<\br>
There are some helper functions that are called by other classes in util package.<\br>

Functions:
===
web.reader/WebPageReader can extract  story article from a news webpage and transform it into XHTML and display.<\br>
web.reader/XMLReader can read in a XML data and display. Note: it has getXPathQueryResults function, which accept Xpath query and out put information from relevant nodes.<\br>
nlp/SentenceDetector can separate article into list of sentences.<\br>
nlp/Tokenizer can separate sentence into list of tokens.<\br>
nlp/Stemmer can stem tokens<\br>
nlp/POStagger will parse list of tokens and output list of POS tags. POS stands for Part of Speech.<\br>
nlp/CapDetector has two functions. <\br>
check function will accept tokens and out put a list of boolean tags to indicate uppercase or lowercase.<\br>
toLowerCase function just work as its name<\br>
fileoperation/CRFPPWriter has several function can help you write file that CRF++ can accept<\br>
fileoperation/TextDocReader can read article in text file and output a string of content<\br>
fileoperation/TrainingDataReader is helpful when you are trying to modify training data structure. It has for parameters, but only first one is real parameter for input file path. Other three parameters are implicit output.<\br>




Good Luck!
