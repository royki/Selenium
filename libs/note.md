To find web page elements, use locator from selenium. In selenium, there are 8 element locator techniques

- ID
- Name
- Link Text
- Partial Link Text
- Tag Name
- CSS Class
- CSS Selector
- XPath

1. Identifier 
- PROS:This strategy doesn’t rely on the structure of the page and will work even if it changes.
- CONS:Easily matches several elements: try to name your username field as login

2. Id
```css
<input id="user" class="required" type="text"http://cdn.techbeamers.com/>
WebElement item = driver.findElement(By.id("user"));
```
- PROS:Each id is supposed to be unique so no chance of matching several elements
- CONS:Works well only on elements with fixed ids and not generated ones

3. Name- there are two filter types :name-value and index
```css
<input id="user" name="admin" class="required" type="text"http://cdn.techbeamers.com/>
WebElement locator = driver.findElement(By.name("admin"));
```
- PROS:Works well with fixed list of similar elements
- CONS:Difficult to use with data-bound lists

Tag Name To Find The Element Using Its HTML Tag.
```css
List<WebElement> linkElements = driver.findElements(By.tagName("results"));
String[] linkTexts = new String[linkElements.size()];
```

CSS Class Name To Access The Elements.
- The CSS class locator uses a specific class attribute to get to the first element on a web page. 
- It is useful for items that own a unique style.

  - CSS class locator example:
```css
WebElement element =driver.findElement(By.className(“sample”));
```

4. Link
```css
<a href="http://www.techbeamers.com">How to use locators?</a>
WebElement item = driver.findElement(By.linkText("How to use locators?"));
```
- PROS:Will only select anchor elements;Useful when testing navigation
- CONS:You have to know the text of the link before

_Partial LinkText_
```css
<a href="http://www.techbeamers.com">How to use locators?</a>
WebElement item = driver.findElement(By.PartialLinkText("How to use locators?"));
```

5. DOM - The DOM strategy works by locating elements that matches the javascript expression refering to an element in the DOM of the page.
- PROS:Javascript allows you to build dynamic locators
- CONS:Relies on the structure of the page

6. XPath - absolute xpath and relative xpath
- Absolute XPath - HTML/head/body/table/tr/td
- Relative XPath - //table/tr/td
- PROS:  Allows very precise locators
_CONS_:
- Slower than CSS
- Relies on browser’s XPath implementation which is not always complete (especially on IE) and as such is not recommended for cross-browser testing

7. CSS
- CSS Selector To Access The Elements.
- CSS Selectors are no different than the XPaths. But they are resilient and powerful. 
- Unlike the XPath, they aren’t dependent on the DOM structure. They can help you perform actions which are difficult to do with XPath.
- CSS Selector example:
`WebElement CheckElements = driver.findElements(By.cssSelector("input[id=email']"));`
- PROS:
  - Much faster than XPath
  - Widely used
  - Provides a good balance between structure and attributes
  - Allows for selection of elements by their surrounding context
- CONS:
  - They tend to be more complex and require a steeper learning curve

8. UI-element
- UI-element is a rather new locator
- It was at first a Selenium IDE extension
- It is now fully integrated into Selenium

- Structure-based locators: locators that rely on the structure of the page to find elements.
  - XPath
  - DOM
  - CSS

- Attributes-based locators: locators that relies on the attributes of the elements to locate them
  - Identifier
  - Id
  - Name
  - Link
  - CSS

6 GET commands
  1. driver.get("");
  2. driver.getTitle();
  3. driver.getPageSource();
  4. driver.getCurrentUrl();
// Used to switch window
  6. driver.getWindowHandle();
  7. driver.gerWindowHandles();
