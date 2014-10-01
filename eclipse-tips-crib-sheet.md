# Java Editing

*	Maximize editor Ctrl+M
*	Quick outline Ctrl+O
*	Quick type hierarchy Ctrl+T
*	Incremental find Ctrl+J, then iterate between matches with Ctrl+K, Ctrl+Shift+K
*	Traverse next/previous annotation Ctrl+. and Ctrl+, to iterate between annotations in file (errors, warnings, todos, etc)

*	Move line/selection Alt+Up/Down
*	Duplicate line/selection Ctrl+Alt+Up/Down
	
*	Content assist 
	* Ctrl+Space
	* See ContentAssist.java

*	Quick fixes/assists
	* Ctrl+3
	* See QuickFixes.java

*	Surround with (Alt+Shift+Z)
	* Try/catch
	* Control structures such as while loop

*	Mark occurrences
	* Put cursor on a field or method to highlight all references
	* Put cursor on a throws clause to highlight all lines that can throw that exception
	* Put cursor on return value to show all possible method exit points (return statements, checked exceptions)

*	Ctrl+Click navigation
	* Jump to declaration/implementation of a method

*	Rename in file
	* Ctrl+2 to open "in-place" refactorings in single editor
	* Rename, extract method
		
*	Save actions: (Window>Preferences>Editor>Save Actions)
	* Cleanup on save
	* Organize imports
	* Format source code
	* Makes it automatic, thoughtless, avoids big diffs mixed with real code changes
	

# Generic IDE features

* Quick access
	* Ctrl+3 to quickly open views, editors, invoke commands
*Key assist
	* One keybinding to rule them all
	* Ctrl+Shift+L
* Automatic editor close
	* Preference to automatically close editors beyond a certain threshold
	* You can't remember what you had open anyway, so let the IDE manage editor tabs for you
	* Never close another editor
* Paste snippet into a project in package explorer 
	* Will auto-generate necessary classes and packages
	
	
* Open Type Ctrl+Shift+T
	* Camel case: NPE to open NullPointerException
	* End of name: Put < character at end of search term to search on name suffix
	
* Split editors Ctrl+Shift+_
* Line numbers: can show or hide line numbers based on your preference
* Dark theme

# Debugging
* Hot code replace
* Drop to frame
* Live edit variable values
* Conditional breakpoints
* Scrapbook