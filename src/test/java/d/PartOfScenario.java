package d;

import static com.natpryce.makeiteasy.MakeItEasy.a;
import static com.natpryce.makeiteasy.MakeItEasy.make;
import static com.natpryce.makeiteasy.MakeItEasy.with;
import static d.EArticleMaker.EArticleFor;
import static d.OEPItemMaker.OEPItem;
import static d.OEPItemMaker.eArticle;
import static d.OEPMaker.OEP;
import static d.OEPMaker.withoutPrescriptionSubProcesses;
import static d.SPMaker.WPSP;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.natpryce.makeiteasy.Maker;

public class PartOfScenario {

	private ArticleFix articles;
	private List<Maker<OEP>> oepList;

	public void given() throws ParseException {
		oepList.add(a(OEP,
				with(withoutPrescriptionSubProcesses, setOf(
						make(a(WPSP,
								with(SPMaker.items,
										sortedSetOf(
												make(a(OEPItem,
														with(eArticle, make(a(EArticleFor(articles.withId("01016150"))))))),
												make(a(OEPItem,
														with(eArticle, make(a(EArticleFor(articles.withId("10042123")))))))
										))))))));
	}

	//START typically static in MakeItFluent
	private <T> Set<T> setOf(final T... items) {
		return new HashSet(Arrays.asList(items));
	}
	private <T> SortedSet<T> sortedSetOf(T... items) {
		return new TreeSet(Arrays.asList(items));
	}
	//END typically static in MakeItFluent


}
